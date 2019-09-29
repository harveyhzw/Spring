package com.harvey.hellowservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HellowServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellowServiceApplication.class, args);
    }

}
