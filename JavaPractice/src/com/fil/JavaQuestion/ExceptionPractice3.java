package com.fil.JavaQuestion;

import java.util.Scanner;

class AgeException extends Exception{
	private int age;
	
	AgeException(int a){
		age = a;
	}

	@Override
	public String toString() {
		return age + " is a invalid age";
	}
	
}

class Employee{
	String name;
	int age;
	
	void getDetails() throws AgeException{
		System.out.println("Enter your name: ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("Enter your ae: ");
		age = sc.nextInt();
		
		if(age < 16) {
			throw new AgeException(age);
		}
	}
}

public class ExceptionPractice3 {

	public static void main(String[] args) 
	{
		try {
			Employee obj = new Employee();
			obj.getDetails();
		}
		catch(AgeException e) {
			System.out.println(e);
		}
	}

}



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueElementsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by spaces: ");
        String inputLine = scanner.nextLine();

        // Split the input string into an array of strings
        String[] inputTokens = inputLine.split(" ");

        // Create a list to store the unique elements
        List<Integer> uniqueElements = new ArrayList<>();

        // Loop through the input tokens
        for (String token : inputTokens) {
            try {
                int num = Integer.parseInt(token);
                // Check if the number is not already in the uniqueElements list
                if (!uniqueElements.contains(num)) {
                    uniqueElements.add(num);
                }
            } catch (NumberFormatException e) {
                // Handle invalid input (non-integer values)
                System.out.println("Invalid input: " + token + " is not an integer.");
            }
        }

        // Display the list of unique elements
        System.out.println("Unique elements in the list: " + uniqueElements);
    }
}


