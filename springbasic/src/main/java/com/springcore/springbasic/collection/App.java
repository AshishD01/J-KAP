package com.springcore.springbasic.collection;

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
				"com/springcore/springbasic/collection/config.xml");

		Employee emp = (Employee) context.getBean("employee1");

		System.out.println(emp);
		System.out.println(emp.getPhones().getClass().getName());

	}
}
