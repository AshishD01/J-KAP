package com.fil.JavaQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperation {

	public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("To choose operation:");
            System.out.println("1 to Add a name");
            System.out.println("2 to  Remove a name");
            System.out.println("3 to  Print all names");
            System.out.println("4 to find and print specific name ");
            System.out.println("5 to check if the name exists already , print yes or no");
            System.out.println("6 to Exit");
            System.out.print("Enter your choice: ");
            

            int choice = sc.nextInt();
            sc.nextLine(); // to get it to the new line
            
            switch (choice) {
            case 1:
                System.out.print("Enter a name to add: ");
                String newName = sc.nextLine();
                nameList.add(newName);
                System.out.println(newName + " added");
                break;
            case 2:
                System.out.print("Enter a name to remove: ");
                String nameToRemove = sc.nextLine();
                if (nameList.remove(nameToRemove)) {
                    System.out.println(nameToRemove + " has been removed.");
                } else {
                    System.out.println(nameToRemove + " not found.");
                }
                break;
            case 3:
            	if(nameList.isEmpty())
            	{
            		System.out.println("List is empty");
            	}
            	else
            	{
                    System.out.println("Names in the list are :");
                    for (String name : nameList) {
                        System.out.println(name);
                    }
            	}
            	break;
            case 4:
                System.out.print("Enter a name to find-index: ");
                String nameToFindIndex = sc.nextLine();
                int index = nameList.indexOf(nameToFindIndex);
                if (index != -1) {
                    System.out.println("Index of " + nameToFindIndex + ": " + index);
                } else {
                    System.out.println(nameToFindIndex + " not found in the list.");
                }
                break;
            case 5:
                System.out.print("Enter a name to check existence: ");
                String nameToCheck = sc.nextLine();
                if (nameList.contains(nameToCheck)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                break;
            case 6:
                System.out.println("Exiting the program.");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
        

	}

	
}
}
