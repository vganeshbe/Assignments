package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name Method...");
	}
	
	public void studentDept() {
		System.out.println("Student Department Method...");
	}

	public void studentId() {
		System.out.println("Student ID Method...");
	}

	public static void main(String[] args) {
		Student student = new Student();
		
//		Methods from College class called from Department Class
		student.studentName();
		student.collegeCode();
		student.collegeName();
		
//		methods from college class
		student.deptName();
		
		student.studentName();
		student.studentDept();
		student.studentId();
	}
}
