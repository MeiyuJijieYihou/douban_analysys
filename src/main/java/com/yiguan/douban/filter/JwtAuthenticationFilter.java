package com.yiguan.douban.filter;

import com.yiguan.douban.service.impl.MyUserDetailsServiceImpl;
import com.yiguan.douban.util.JwtTokenProvider;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description: Taken验证拦截器
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/24 14:27
 * @since JDK 1.8
 */
@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private MyUserDetailsServiceImpl userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = getJwtFromRequest(request);

        if (token != null && jwtTokenProvider.validateToken(token)) {
            String username = getUsernameFromJwt(token, JwtTokenProvider.JWT_TOKEN_SECRET);
            UserDetails userDetails = userService.loadUserByUsername(username);
            Authentication authentication = new UsernamePasswordAuthenticationToken(
                    userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);

        }
        super.doFilter(request, response, filterChain);
    }

    private String getJwtFromRequest(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token != null && token.startsWith("Bearer")) {
            return token.replace("Bearer ", "");
        }
        return null;
    }

    private String getUsernameFromJwt(String token, String signKey) {
        return Jwts.parser().setSigningKey(signKey)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
