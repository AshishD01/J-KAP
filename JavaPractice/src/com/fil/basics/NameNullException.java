package com.fil.basics;

public class NameNullException extends Exception{
	String s;
	String s1;
	
	public NameNullException(String s, String s1)
	{
		this.s = s;
		this.s1 = s1;
	}
	
	@override
	public String toString()
	{
		return "First and Last Name cannot be null";
	}
}
