package com.yiguan.douban.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Description:
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/24 14:20
 * @since JDK 1.8
 */
@Slf4j
@Component
public class JwtTokenProvider {
    public static final String jwtTokenSecret = "secret";
    public static final long date = 604800000;

    public String createJwtToken(Authentication authentication) {
        String username = ((org.springframework.security.core.userdetails.User) authentication.getPrincipal()).getUsername();
        Date expireTime = new Date(System.currentTimeMillis() + date);
        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(expireTime)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS512, jwtTokenSecret)
                .compact();
        return token;
    }

    public boolean validateToken(String token) {
        String VALIDATE_FAILED ="validate failed : ";
        try {
            Jwts.parser()
                    .setSigningKey(jwtTokenSecret)
                    .parseClaimsJws(token);
            return true;
        }catch (Exception ex) {
            log.error(VALIDATE_FAILED + ex.getMessage());
            return false;
        }
    }
}
