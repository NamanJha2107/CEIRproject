package com.example.CEIRproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CeirProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(CeirProjectApplication.class, args);
    }

}
