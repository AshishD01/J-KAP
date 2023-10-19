package com.springcore.springbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasic/config.xml");
		
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		Student student3 = (Student) context.getBean("student3");
		Student student4 = (Student) context.getBean("student4");
		Student student5 = (Student) context.getBean("student5");
		Student student6 = (Student) context.getBean("student6");
		Student student7 = (Student) context.getBean("student7");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5); //constructor
		System.out.println(student6); //constructor
		System.out.println(student7); //constructor
	}
}
