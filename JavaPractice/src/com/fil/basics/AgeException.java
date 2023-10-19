package com.fil.basics;

public class AgeException extends Exception {
	int age;
	
	public AgeException(int age)
	{
		this.age = age;
	}
	

	@Override
	public String toString()
	{
		return "Age cannot be below 15";
	}

}
