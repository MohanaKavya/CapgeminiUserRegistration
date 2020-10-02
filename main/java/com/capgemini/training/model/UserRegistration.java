package com.capgemini.training.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
		// Constants
		private final static String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-z]{2,}$";
		private final static String LAST_NAME_PATTERN = "^[A-Z]{1}[a-zA-z]{2,}$";
		private final static String EMAIL_PATTERN = "^[a-z0-9-_\\+]+([\\.][a-z0-9]+)*[\\@]([a-z0-9]{1}|[a-z]{2}|[a-z0-9]{3,})[\\.]([a-z]{2}|[a-z0-9]{3,}|(([a-z]{2}|[a-z0-9]{1}|[a-z0-9]{3,})([\\.][a-z]{2}|[\\.][a-z0-9]{3,})))$";;
		private final static String PHONE_NUMBER_PATTERN = "^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}$";
		private final static String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-=_+]).{8,}$";
		
		// Validate User's First Name
		public boolean validateFirstName(String fName) {
			try {
			Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
			Matcher m = pattern.matcher(fName);
			if(m.matches()) {
				return true;
			}
			else {
				throw new UserInputInvalidException("Invalid First Name"); 
			}
			}
			catch(Exception e) {
				System.out.println("Exception : "+e.getMessage());
				return false;	
			}
		}
		// Validate User's Last Name
		public boolean validateLastName(String lName) {
			try {
			Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
			Matcher m = pattern.matcher(lName);
			if(m.matches()) {
				return true;
			}
			else {
				throw new UserInputInvalidException("Invalid Last Name"); 
			}		
			} catch (Exception e) {
				System.out.println("Exception : "+e.getMessage());
				return false;
			}
		}
		// Validate User's Email
		public boolean validateEmail(String email) {
			try {
				Pattern pattern = Pattern.compile(EMAIL_PATTERN);
				Matcher m = pattern.matcher(email);
				if(m.matches()) {
					return true;
				}
				else {
					throw new UserInputInvalidException("Invalid Email"); 
				}
			} catch (Exception e) {
				System.out.println("Exception : "+e.getMessage());
				return false;
			}		
		}
		// Validate User's Phone Number
		public boolean validateMobile(String phoneNo) {
			try {
				Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
				Matcher m = pattern.matcher(phoneNo);
				if(m.matches()) {
					return true;
				}
				else {
					throw new UserInputInvalidException("Invalid Phone Number"); 
				}
				
			} catch (Exception e) {
				System.out.println("Exception : "+e.getMessage());
				return false;
			}	
		}
		// Validate User's Password
		public boolean validatePassword(String password) {
			try {
				Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
				Matcher m = pattern.matcher(password);
				if(m.matches()) {
					return true;
				}
				else {
					throw new UserInputInvalidException("Invalid Password"); 
				}
				
			} catch (Exception e) {
				System.out.println("Exception : "+e.getMessage());
				return false;
			}
		}


	public static void main(String[] args) {
		
		boolean match = false;
		UserRegistration user = new UserRegistration();
		// Display Message
		System.out.println("User Registration");
		
		Scanner sc = new Scanner(System.in);
		// First Name User Input
		do {
		System.out.println("Enter Your First Name for User Registration :");
		String firstName = sc.next();
		match = user.validateFirstName(firstName);
		if(match)
			System.out.println("First Name : "+firstName);
		}while(match==false);
		
		// Last Name User Input
		do {
		System.out.println("Enter Your Last Name for User Registration :");
		String lastName = sc.next();
		match = user.validateLastName(lastName);
		if(match)
			System.out.println("Last Name : "+lastName);
		}while(match==false);
		
		// Email User Input
		do {
		System.out.println("Enter Your Email ID for User Registration :");
		String email = sc.next();
		match = user.validateEmail(email);
		if(match)
			System.out.println("Email : "+email);
		}while(match==false);

		sc.nextLine();
		// Phone Number User Input
		do {
		System.out.println("Enter Your Phone Number for User Registration :");
		String phoneNo = sc.nextLine();
		match = user.validateMobile(phoneNo);
		if(match)
			System.out.println("Phone Number : "+phoneNo);
		}while(match==false);
		
		// Password User Input
		do {
		System.out.println("Enter Your Password for User Registration :");
		String password = sc.next();
		match = user.validatePassword(password);
		if(match)
			System.out.println("Password : "+password);
		}while(match==false);
		
	}

}
