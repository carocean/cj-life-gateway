package cj.life.gateway.config;

import cj.life.ability.oauth2.gateway.annotation.EnableOAuth2Gateway;
import cj.life.ability.oauth2.gateway.config.SecurityWorkbin;
import cj.life.ability.redis.annotation.EnableRedis;
import org.springframework.context.annotation.Configuration;

@EnableOAuth2Gateway
@EnableRedis
@Configuration
public class GatewaySecurityWorkbin extends SecurityWorkbin {
}
