package com.springcore.springbasic.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springbasic/stereotypeannotations/config.xml");

		Student s1=context.getBean("student1",Student.class);
		Student s2=context.getBean("student1",Student.class);
	

		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
}
