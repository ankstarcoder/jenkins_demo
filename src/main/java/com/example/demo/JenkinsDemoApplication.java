package com.example.demo;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {
	private static final org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started succesfully");
	}

	public static void main(String[] args) {
		logger.info("Application executed succesfully");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
