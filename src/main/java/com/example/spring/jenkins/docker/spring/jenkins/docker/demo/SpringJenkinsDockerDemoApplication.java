package com.example.spring.jenkins.docker.spring.jenkins.docker.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDockerDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDockerDemoApplication.class);

	public static void main(String[] args) {
		logger.info("Application started ...");

		SpringApplication.run(SpringJenkinsDockerDemoApplication.class, args);
	}

}
