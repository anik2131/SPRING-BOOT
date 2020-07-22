package com.anik.springboot.RestController.SpringRequestMappingJSPConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anik.springboot"})
public class SpringRequestMappingJspConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRequestMappingJspConnectionApplication.class, args);
	}

}
