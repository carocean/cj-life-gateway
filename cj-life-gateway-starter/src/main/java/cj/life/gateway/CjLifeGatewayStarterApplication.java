package cj.life.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"cj.life.gateway"})
@EnableEurekaClient
public class CjLifeGatewayStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CjLifeGatewayStarterApplication.class, args);
    }

}
