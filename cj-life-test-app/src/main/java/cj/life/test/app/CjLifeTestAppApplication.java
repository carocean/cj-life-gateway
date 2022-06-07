package cj.life.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cj.life.test.app"})
public class CjLifeTestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CjLifeTestAppApplication.class, args);
    }

}
