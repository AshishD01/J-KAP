package com.fil.JavaQuestion;

public class ExceptionPractice1 {

	public static void validate(int age, String name) {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible to vote AGE");
		} else {
			System.out.println("Person is eligible to vote! AGE");
		}

		if (name == "ram") {
			throw  new RuntimeException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13, "shyam");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
