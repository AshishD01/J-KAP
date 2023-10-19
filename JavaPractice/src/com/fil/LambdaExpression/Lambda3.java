package com.fil.LambdaExpression;

import java.util.Scanner;

interface input {
	Boolean ans(String username, String password);
}

public class Lambda3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		input rs = (String u, String p) -> {
			if (u.equals("ajay") && p.equals("123")) {
				return true;
			} else {
				return false;
			}
		};

		System.out.print("Enter username : ");
		String username = sc.nextLine();
		System.out.print("Enter password : ");
		String password = sc.nextLine();

		System.out.println(rs.ans(username, password));

	}

}
