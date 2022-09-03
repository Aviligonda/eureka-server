package com.bridgelabz.euorekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuorekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuorekaServerApplication.class, args);
    }

}
