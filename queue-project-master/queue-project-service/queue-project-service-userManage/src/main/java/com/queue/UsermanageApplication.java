package com.queue;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsermanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermanageApplication.class, args);
    }

}
