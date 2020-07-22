package com.anik.springboot.RestController.SpringRestControllerandGetMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anik.springboot"})
public class SpringRestControllerAndGetMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestControllerAndGetMappingApplication.class, args);
	}

}
