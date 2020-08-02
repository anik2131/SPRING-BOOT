package com.anik.springboot.fileUploadController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
	@GetMapping("/uploads")
	public String getUploadPage()
	{
		return "uploads";
	}
	
	@PostMapping("/uploads")
	public String upload(ModelMap model , @PathVariable("file") MultipartFile  file)
	{
		StringBuilder filename = new StringBuilder();
		
		
			Path filenameandpath = Paths.get(uploadDirectory, file.getOriginalFilename());
			filename.append(file.getOriginalFilename());
			try {
				Files.write(filenameandpath, file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		model.addAttribute("msg" , "Successfully Uploaded" + filename.toString() + " ");
		return "uploads";
	}
}
