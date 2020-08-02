package com.anik.springboot;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anik.springboot.fileUploadController.FileUploadController;

@SpringBootApplication
public class ZonixQuizapp1Application {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(ZonixQuizapp1Application.class, args);
	}

}
