package com.springcore.springbasic.standalonecollections;

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
				"com/springcore/springbasic/standalonecollections/config.xml");

		Person p1=context.getBean("person1",Person.class);
		Person p2=context.getBean("person2",Person.class);

		System.out.println(p1);
		System.out.println(p2);

	}
}
