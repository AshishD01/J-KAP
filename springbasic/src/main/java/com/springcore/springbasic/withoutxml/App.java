package com.springcore.springbasic.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);

		Student s1=context.getBean("getStudent",Student.class);

		System.out.println(s1);
		s1.study();

	}
}
