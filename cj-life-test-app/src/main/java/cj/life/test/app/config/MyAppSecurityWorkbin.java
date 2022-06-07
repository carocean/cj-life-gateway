package cj.life.test.app.config;

import cj.life.ability.oauth2.app.annotation.EnableOAuth2App;
import cj.life.ability.oauth2.app.config.AppSecurityWorkbin;
import org.springframework.context.annotation.Configuration;

@EnableOAuth2App
@Configuration
public class MyAppSecurityWorkbin extends AppSecurityWorkbin {
}
