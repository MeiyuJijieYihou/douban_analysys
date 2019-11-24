package com.yiguan.douban.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

/**
 * Description: 资源权限认证器
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/23 22:16
 * @since JDK 1.8
 */
@Slf4j
@Component
public class MyAccessDecisionManager implements AccessDecisionManager {

    /**
     * description: 判断是否具有权限
     *
     * @return void
     * @params [authentication, o, collection]
     * @author LiBingxiang
     * @date 2019/11/23 22:17
     */
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        // 无权限访问
        if (CollectionUtils.isEmpty(configAttributes)) {
            log.info("无访问权限.");
            throw new AccessDeniedException("无访问权限.");
        }
        for (ConfigAttribute configAttribute : configAttributes) {
            String needRole = configAttribute.getAttribute();
            for (GrantedAuthority grantedAuthority : authentication.getAuthorities()) {
                //grantedAuthority 为用户所被赋予的权限。 needRole 为访问相应的资源应该具有的权限。
                //判断两个请求的url的权限和用户具有的权限是否相同，如相同，允许访问 权限就是那些以ROLE_为前缀的角色
                if (needRole.trim().equals(grantedAuthority.getAuthority().trim())) {
                    //匹配到对应的角色，则允许通过
                    return;
                }
            }
        }
        //该url具有访问权限，但是当前登录用户没有匹配到URL对应的权限，则抛出无权限错误
        log.info("无访问权限.");
        throw new AccessDeniedException("无访问权限.");
    }


    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
