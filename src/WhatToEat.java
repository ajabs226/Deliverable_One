import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		// Validate password meets requirements
		// At least one lowercase letter
		// At least one uppercase letter
		// Min of 7 characters
		// Max of  12 characters
		// 1 exclamation point: !
		// all reqs. met - "Password valid and accepted."
		// not all reqs met - "Error."
		
		Scanner scnr = new Scanner(System.in);
		String password;
		//int n = Validation(password);
		System.out.print("Enter a password with the following requirements: " 
				+ "\n1.  Must have one lowercase letter "
				+ "\n2.  One uppercase letter "
				+ "\n3.  At least 7 characters, but no more than 12 "
				+ "\n4.  And contain an exclamation point (!)");
		password = scnr.nextLine();
		if (password.length() >= 7 
			&& password.length() <= 12 
			&& password.length() != 0
			&& password.matches(".*[a-z].*")
			&& password.matches(".*[A-Z].*")
			&& password.contains("!"))
		{
			System.out.println("valid");
		} else {
			System.out.println("error");
		}
	}
		
		
}

