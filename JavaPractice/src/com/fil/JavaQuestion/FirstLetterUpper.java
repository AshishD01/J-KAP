package com.fil.JavaQuestion;

public class FirstLetterUpper {
	
	public static final String capitalize(String str)   
	{  
	if (str == null || str.length() == 0) return str;  
	return str.substring(0, 1).toUpperCase() + str.substring(1);  
	} 

	public static void main(String[] args) {
		System.out.println(capitalize("parth"));     
		

	}

}
