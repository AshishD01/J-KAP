package com.fil.basics;

import java.util.Scanner;

public class Person 
{

	public static void main(String[] args) throws NameNullException, AgeException 
	{
		Per obj = new Per();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String first_name = s.nextLine();
		System.out.println("Enter the last name: ");
		String last_name = s.nextLine();
		if(first_name.equals("") || last_name.equals("")) {
			throw new NameNullException(first_name, last_name);
		}
		
		System.out.println("Enter the age: ");
		int age = s.nextInt();
		if(age<=15)
		{
			throw new AgeException(age);
		}
		
		
		System.out.println("Enter the gender: ");
		String gender = s.nextLine();
		
		System.out.println(obj.first_name);
		System.out.println(obj.last_name);
		System.out.println(obj.gender);
		System.out.println(obj.age);
		System.out.println(obj.weight);
	}

}
