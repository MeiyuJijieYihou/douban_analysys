package com.yiguan.douban.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Description: Taken工具类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/24 14:20
 * @since JDK 1.8
 */
@Slf4j
@Component
public class JwtTokenProvider {
    public static final String JWT_TOKEN_SECRET = "secret";
    public static final long DATE = 604800000;

    /**
     * description: 生成taken
     *
     * @params [authentication]
     * @return java.lang.String
     * @author LiBingxiang
     * @date 2019/11/24 21:24
     */
    public String createJwtToken(Authentication authentication) {
        String username = ((org.springframework.security.core.userdetails.User) authentication.getPrincipal()).getUsername();
        Date expireTime = new Date(System.currentTimeMillis() + DATE);
        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(expireTime)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS512, JWT_TOKEN_SECRET)
                .compact();
        return token;
    }

    /**
     * description: 验证taken
     *
     * @params [token]
     * @return boolean
     * @author LiBingxiang
     * @date 2019/11/24 21:24
     */
    public boolean validateToken(String token) {
        String VALIDATE_FAILED ="validate failed : ";
        try {
            Jwts.parser()
                    .setSigningKey(JWT_TOKEN_SECRET)
                    .parseClaimsJws(token);
            return true;
        }catch (Exception ex) {
            log.error(VALIDATE_FAILED + ex.getMessage());
            return false;
        }
    }
}
