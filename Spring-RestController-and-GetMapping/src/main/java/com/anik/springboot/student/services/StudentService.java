package com.anik.springboot.student.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.anik.springboot.student.entity.Student;

@Service
public class StudentService {

	private static List<Student> students = new ArrayList<Student>();
	static
	{
		Student student1 = new Student("S101", "ANIK", "KASBA");
		Student student2 = new Student("S102", "SUBHRAJIT", "MADURDAHA");
		Student student3 = new Student("S103", "TATHAGATA", "SELIMPUR");
		Student student4 = new Student("S104", "SAMRAT", "SANTRAGACHI");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
	}
	
	public List<Student> viewAllStudents()
	{
		return students;
	}
	
	public Student returnSpecificStudent(String sid)
	{
		for(Student student : students)
		{
			if(student.getSid().equals(sid))
			{
				return student;
			}
		}
		return null;
	}
}
