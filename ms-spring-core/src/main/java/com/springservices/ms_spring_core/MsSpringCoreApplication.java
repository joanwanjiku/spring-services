package com.springservices.ms_spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(
		scanBasePackages = {"com.springservices.ms_spring_core",
		"com.springservices.util"}
)*/
@SpringBootApplication
public class MsSpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringCoreApplication.class, args);
	}
}
