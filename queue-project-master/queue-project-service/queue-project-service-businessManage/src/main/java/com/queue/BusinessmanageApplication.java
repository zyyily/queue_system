package com.queue;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusinessmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessmanageApplication.class, args);
    }

}
