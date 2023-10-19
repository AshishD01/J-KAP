package com.springcore.springbasic.withoutxml;

import org.springframework.stereotype.Component;

//@Component("stud")
public class Student {
	
	private int rollno;
	private String name;
	private Employee employee;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void study() {
		this.employee.work();
		System.out.println("student is studying");
	}
	public Student(int rollno, String name, Employee employee) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.employee = employee;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", employee=" + employee + "]";
	}
	
	

}
