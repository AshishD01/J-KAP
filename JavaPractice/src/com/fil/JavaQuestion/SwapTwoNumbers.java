package com.fil.JavaQuestion;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of X and Y");  
		int firstNumber = sc.nextInt();  
		int secondNumber = sc.nextInt();  
		System.out.println("before swapping numbers: "+firstNumber +"  "+ secondNumber);    
		int temp = firstNumber;  
		firstNumber = secondNumber;  
		secondNumber = temp;  
		System.out.println("After swapping: "+firstNumber +"   " + secondNumber);  
		System.out.println( ); 

	}

}
