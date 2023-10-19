package com.springcore.springbasic.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages="com.springcore.springbasic.withoutxml")
public class Javaconfig {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	
	@Bean
	public Student getStudent() {
		Student st = new Student(152,"Ashish",getEmployee());
		return st;
	}
	

}
