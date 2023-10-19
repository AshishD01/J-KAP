package com.springcore.springbasic;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student1")
@Scope("prototype")  //both the hashing will differ....
public class Student {
	
	@Value("Ashish")
	private String studentName;
	
	@Value("Gurgaon")
	private String city;
	
	@Value("#{sample}")
	private List<String>address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Student(String studentName, String city, List<String> address) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}

	

}
