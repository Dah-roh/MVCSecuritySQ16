package com.deca.securitysquad16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SecuritySquad16Application {

    public static void main(String[] args) {
        SpringApplication.run(SecuritySquad16Application.class, args);
    }

}
