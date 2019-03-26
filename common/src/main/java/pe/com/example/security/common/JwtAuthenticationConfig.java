package pe.com.example.security.common;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * Config JWT.
 * Only one property 'shuaicj.security.jwt.secret' is mandatory.
 */
@Getter
@ToString
public class JwtAuthenticationConfig {

    @Value("${auth.security.jwt.url:/login}")
    private String url;

    @Value("${auth.security.jwt.header:Authorization}")
    private String header;

    @Value("${auth.security.jwt.prefix:Bearer}")
    private String prefix;

    @Value("${auth.security.jwt.expiration:#{24*60*60}}")
    private int expiration; // default 24 hours

    @Value("${auth.security.jwt.secret}")
    private String secret;
}
