package com.fil.basics;

import java.util.Scanner;

public class CheckPositiveNegative
{
//	public static void main(String args[])
//	{
//		System.out.println("First Name: Divya");
//		System.out.println("Last Name: Bharathi");
//		System.out.println("Gender: F");
//		System.out.println("Age: 80");
//		System.out.println("Weight: 85.55");
//	}
	
	public static void main(String args[])
	{
		Person  p1 = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		p1.firstname = sc.nextLine();
		System.out.println(p1.hashCode());
	}

}
