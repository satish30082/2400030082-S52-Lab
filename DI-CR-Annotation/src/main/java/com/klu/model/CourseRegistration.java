package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration {
	@Value("101")
	private int rollNo;
	@Value("Sathwik")
	private String studentName;
	@Value("FSAD")
	private String courseName;
	@Value("4")
	private int semester;
	
	public CourseRegistration(int no, String name ,String cn,int sem) {
		rollNo=no;
		studentName=name;
		courseName=cn;
		semester=sem;
	}
	public void display() {
		System.out.println("RollNo:"+ rollNo);
		System.out.println("StudentName"+ studentName);
		System.out.println("CourseName:"+ courseName);
		System.out.println("Semester:"+ semester);
	}
}
