package com.fil.JavaQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindUniqueElement {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by spaces: ");
        String inputLine = sc.nextLine();
        
        // Split the input string into an array of strings
        String[] inputTokens = inputLine.split(" ");

        // Create a list to store the unique elements
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        
        
        for (String i : inputTokens) { // Iteration
            try {
                int num = Integer.parseInt(i);
                if (!uniqueElements.contains(num)) {
                    uniqueElements.add(num);
                }
            }
            catch(NumberFormatException e)
            {
            	System.out.println("Invalid "+i);
            }
	}
        
        System.out.println("Unique elements in the list are "+ uniqueElements);

}
}
