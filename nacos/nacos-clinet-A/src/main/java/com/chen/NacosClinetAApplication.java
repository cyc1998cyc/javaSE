package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosClinetAApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosClinetAApplication.class, args);
    }

}
