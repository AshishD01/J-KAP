package com.springcore.springbasic.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springbasic/referencetype/config.xml");
		
		Housing housing = (Housing) context.getBean("house1");
		System.out.println(housing);
		System.out.println(housing.getHousingId());
		System.out.println(housing.getObj());
		System.out.println(housing.getObj().getBuildingId());

	}
}
