package cj.life.gateway.config;

import cj.life.ability.oauth2.gateway.annotation.EnableCjOAuth2Gateway;
import cj.life.ability.oauth2.gateway.config.SecurityWorkbin;
import cj.life.ability.redis.annotation.EnableCjRedis;
import org.springframework.context.annotation.Configuration;

@EnableCjOAuth2Gateway
@EnableCjRedis
@Configuration
public class GatewaySecurityWorkbin extends SecurityWorkbin {
}
