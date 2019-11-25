package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.SysRole;
import com.yiguan.douban.entity.SysUser;
import com.yiguan.douban.mapper.SysUserMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: 用户身份权限认证类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/22 21:54
 * @since JDK 1.8
 */
@Service
public class MyUserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private SysUserMapper sysUserMapper;

    /**
     * description: 加载用户信息
     *
     * @params [username]
     * @return org.springframework.security.core.userdetails.UserDetails
     * @author LiBingxiang
     * @date 2019/11/24 21:22
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserMapper.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (SysRole sysRole : user.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(sysRole.getName()));
        }
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
