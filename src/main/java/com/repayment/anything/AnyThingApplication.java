package com.repayment.anything;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableScheduling
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AnyThingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnyThingApplication.class, args);
    }

}
