package com.fil.JavaQuestion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class Customer {
    private static int nextCustomerId = 1000;

    private int customerId;
    private String name;
    private String email;
    private String contact;
    private String accountType;

    public Customer(String name, String email, String contact, String accountType) {
        this.customerId = nextCustomerId++;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.accountType = accountType;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\nName: " + name + "\nEmail: " + email + "\nContact: " + contact
                + "\nAccount Type: " + accountType + "\n";
    }
}

public class BankCustomerManagementSystem {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
        int choice;
        do {
            displayMenu();
            choice = getChoice();

            switch (choice) {
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    displayCustomers();
                    break;
                case 3:
                    searchCustomers();
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    System.out.println("Exiting the bank application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
	}
	
	private static void displayMenu() {
        System.out.println("Welcome to Fidelity International");
        System.out.println("Please enter your choice:");
        System.out.println("1 for Add new Customer");
        System.out.println("2 for Display Customers");
        System.out.println("3 for Search Customers");
        System.out.println("4 for Delete Customers");
        System.out.println("5 for Exit the bank application");
    }
	
	private static int getChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear the invalid input
            System.out.println("Invalid choice. Please enter a number.");
            return -1;
        }
    }
	
	private static void addNewCustomer() {
        System.out.println("Please enter customer details:");
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter account type (Savings or Current): ");
        String accountType = scanner.nextLine();

        if (isValidInput(name, email, contact, accountType)) {
            Customer customer = new Customer(name, email, contact, accountType);
            customerList.add(customer);
            System.out.println("Customer added successfully with customer id " + customer.getCustomerId());
        } else {
            System.out.println("Invalid input. Customer not added.");
        }
    }
	
	private static boolean isValidInput(String name, String email, String contact, String accountType) {
        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name. Name can only contain alphabets.");
            return false;
        }

        if (!Pattern.matches("^[\\w.-]+@([\\w\\-]+\\.)+[A-Za-z]{2,4}$", email)) {
            System.out.println("Invalid email address.");
            return false;
        }

        if (!contact.matches("\\d{10}")) {
            System.out.println("Invalid contact number. Contact number should have 10 digits.");
            return false;
        }

        if (!accountType.equalsIgnoreCase("Savings") && !accountType.equalsIgnoreCase("Current")) {
            System.out.println("Invalid account type. Account type can be either Savings or Current.");
            return false;
        }

        return true;
    }
	
	private static void displayCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            System.out.println("Existing customer details:");
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }
	
	private static void searchCustomers() {
        System.out.print("Enter customer ID to search: ");
        try {
            int customerId = scanner.nextInt();
            boolean found = false;
            for (Customer customer : customerList) {
                if (customer.getCustomerId() == customerId) {
                    System.out.println("Customer found:\n" + customer);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Customer with ID " + customerId + " not found.");
            }
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear the invalid input
            System.out.println("Invalid customer ID. Please enter a number.");
        }
    }
	
	private static void deleteCustomer() {
        System.out.print("Enter customer ID to delete: ");
        try {
            int customerId = scanner.nextInt();
            boolean removed = false;
            for (Customer customer : customerList) {
                if (customer.getCustomerId() == customerId) {
                    customerList.remove(customer);
                    System.out.println("Customer with ID " + customerId + " deleted successfully.");
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("Customer with ID " + customerId + " not found.");
            }
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear the invalid input
            System.out.println("Invalid customer ID. Please enter a number.");
        }
    }
}
