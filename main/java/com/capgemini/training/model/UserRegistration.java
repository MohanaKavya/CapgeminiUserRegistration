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
		
		match = false;
		do {
		System.out.println("Enter Your Email ID for User Registration :");
		String email = sc.next();
		
		String patternEmail = "^[a-z]{3}(.([a-z]{3}))?@[a-z]{2}.[a-z]{2}(.([a-z]{2}))?$";
		
		Pattern pattern = Pattern.compile(patternEmail);
		Matcher m = pattern.matcher(email);
		
		if(m.matches()) 
				match = true;
		else
			System.out.println("Invalid Email. Try Again");
		}while(match == false);
		
		match = false;
		sc.nextLine();
		
		do {
		System.out.println("Enter Your Phone Number for User Registration :");
		String phoneNo = sc.nextLine();
		
		String patternPhone = "^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}$";
		
		Pattern pattern = Pattern.compile(patternPhone);
		Matcher m = pattern.matcher(phoneNo);
		
		if(m.matches()) 
				match = true;
		else
			System.out.println("Invalid Phone Number. Try Again");
		}while(match == false);
		
		match = false;
		do {
		System.out.println("Enter Your Password for User Registration :");
		String password = sc.next();
		
		String patternPassword = "^(?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
		
		Pattern pattern = Pattern.compile(patternPassword);
		Matcher m = pattern.matcher(password);
		
		if(m.matches()) 
				match = true;
		else
			System.out.println("Invalid Password. Try Again");
		}while(match == false);
		
		
	}

}
