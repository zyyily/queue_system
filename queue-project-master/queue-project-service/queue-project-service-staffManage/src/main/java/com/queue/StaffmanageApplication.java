package com.queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StaffmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffmanageApplication.class, args);
    }

}
