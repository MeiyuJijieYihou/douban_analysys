package com.yiguan.douban.config;

import com.yiguan.douban.entity.SysRolePermission;
import com.yiguan.douban.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Description: 加载资源与权限的关系
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/23 22:00
 * @since JDK 1.8
 */
@Slf4j
@Component
public class MyInvocationSecurityMetadataSourceService implements FilterInvocationSecurityMetadataSource {
    @Resource
    private SysUserMapper sysUserMapper;

    private static HashMap<String, Collection<ConfigAttribute>> map = null;

    /**
     * description: 初始化所有资源对应的角色
     * 
     * @params []
     * @return void
     * @author LiBingxiang
     * @date 2019/11/23 22:03
     */
    public void loadResourceDefine(){
        map = new HashMap<>();
        // 权限资源和角色对应的表,也就是角色-权限中间表
        List<SysRolePermission> rolePermissions = sysUserMapper.findAllRolePermission();
        // 每个资源所需要的角色
        for (SysRolePermission rolePermission : rolePermissions) {
            String url = rolePermission.getUrl();
            String roleName = rolePermission.getRoleName();
            ConfigAttribute role = new SecurityConfig(roleName);
            if (map.containsKey(url)) {
                map.get(url).add(role);
            } else {
                map.put(url, new ArrayList<ConfigAttribute>() {{
                    add(role);
                }});
            }
        }
    }

    /**
     * description: 返回当前访问的资源所需要的角色
     *
     * @params [o]
     * @return java.util.Collection<org.springframework.security.access.ConfigAttribute>
     * @author LiBingxiang
     * @date 2019/11/23 22:14
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        if (map == null) {
            loadResourceDefine();
        }
        // o中包含用户请求的request信息
        HttpServletRequest request = ((FilterInvocation) object).getRequest();
        for (String url : map.keySet()) {
            if (new AntPathRequestMatcher(url).matches(request)) {
                return map.get(url);
            }
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
