package com.queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MessagemanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagemanageApplication.class, args);
    }
}
