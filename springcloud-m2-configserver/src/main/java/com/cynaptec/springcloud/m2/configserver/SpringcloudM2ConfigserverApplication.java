package com.cynaptec.springcloud.m2.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudM2ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM2ConfigserverApplication.class, args);
	}
}
