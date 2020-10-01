package com.capgemini.training.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		boolean match = false;
		
		// Display Message
		System.out.println("User Registration");
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter Your First Name for User Registration :");
		String firstName = sc.next();
		
		String patternFirstName = "^[A-Z]{1}[a-zA-z]{2,}$";
		
		Pattern pattern = Pattern.compile(patternFirstName);
		Matcher m = pattern.matcher(firstName);
		
		if(m.matches()) 
			match = true;
		else
			System.out.println("Invalid First Name. Try Again");
		}while(match == false);
		
		match = false;
		
		do {
		System.out.println("Enter Your Last Name for User Registration :");
		String lastName = sc.next();
		
		String patternLastName = "^[A-Z]{1}[a-zA-z]{2,}$";
		
		Pattern pattern = Pattern.compile(patternLastName);
		Matcher m = pattern.matcher(lastName);
		
		if(m.matches()) 
				match = true;
		else
			System.out.println("Invalid Last Name. Try Again");
		}while(match == false);
		
	}

}
