package com.cynaptec.springcloud.m2.configserver.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudM2ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM2ConfigserverGitApplication.class, args);
	}
}
