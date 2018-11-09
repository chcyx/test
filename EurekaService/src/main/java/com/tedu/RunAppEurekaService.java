package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class RunAppEurekaService {

	public static void main(String[] args) {
		SpringApplication.run(RunAppEurekaService.class, args);
	}

}
