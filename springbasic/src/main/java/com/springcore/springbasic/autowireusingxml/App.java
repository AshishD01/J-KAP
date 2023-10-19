package com.springcore.springbasic.autowireusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasic/autowireusingxml/config.xml");
		
		Employee employee1 = context.getBean("emp1",Employee.class);

		System.out.println(employee1);
		

	}
}
