package com.scout.pois;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


//@SpringBootApplication
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SwtxpoisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwtxpoisApplication.class, args);
    }

}
