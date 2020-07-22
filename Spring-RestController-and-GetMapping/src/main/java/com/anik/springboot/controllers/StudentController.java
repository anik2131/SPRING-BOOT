package com.anik.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anik.springboot.student.entity.Student;
import com.anik.springboot.student.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public List<Student> getAll() {
		return studentService.viewAllStudents();
	}

	@GetMapping("/students/{sid}")
	public Student getSpecific(@PathVariable String sid) {
		return studentService.returnSpecificStudent(sid);
	}

}
