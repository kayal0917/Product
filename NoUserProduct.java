package com.chainsys.project;
import java.util.Scanner;

public class NoUserProduct {

//	public static void main(String[] args) {
		public static void detailss() {
			
		System.out.println("create new account or can't access");
		System.out.println("create new account");
		String Username = "kayal17";
		String Password = "123@";
		String Username2 = "Ash17";
		String Password2 = "4562@";
		String Username3 = "Angel17";
		String Password3 = "789@";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = scanner.nextLine();
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();
		if (username.equals(Username) && password.equals(Password)) {
			System.out.println("Welcome");
		} else {
			System.out.println("Please try again.");

	}

	}

}
