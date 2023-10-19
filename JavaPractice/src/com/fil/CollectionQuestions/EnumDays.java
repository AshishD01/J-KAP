package com.fil.CollectionQuestions;

import java.util.Scanner;
public class EnumDays {
	
	enum DAYS
	{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week day");
		String day = sc.next();
		
		System.out.println("PRINTED "+DAYS.valueOf("MONDAY").toString());
		DAYS d = DAYS.valueOf(day.toUpperCase());
		
		switch(d)
		{
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			System.out.println("Ooh I need to work today");
			break;
		case FRIDAY:
		case SATURDAY:
		case SUNDAY:
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
