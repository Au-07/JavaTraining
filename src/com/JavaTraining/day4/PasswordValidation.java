package com.JavaTraining.day4;
import java.util.*;
class InvalidPasswordException extends RuntimeException{
	public InvalidPasswordException(String e) { super(e); }
	
}


class IncorrectPasswordException extends RuntimeException{
	public IncorrectPasswordException(String e) { super(e); }
}


public class PasswordValidation {
	public static void main(String[] args) throws InvalidPasswordException , IncorrectPasswordException{
		Scanner sc = new Scanner(System.in);
		String uname = "Username";
		String upass = "userN@8e";
		
		String pass = sc.next();
		boolean hasDigit = false;
		boolean hasUpper = false;
		boolean hasSpeacial = false;
		
		
		for ( char x : pass.toCharArray() ) {
			if( Character.isUpperCase(x) ) hasUpper = true;
			if ( Character.isDigit(x) ) hasDigit = true;
			if ( !Character.isLetterOrDigit(x) ) hasSpeacial = true;
		}
			
		try {
			if ( !hasUpper ) throw new InvalidPasswordException("Password Must contain an Uppercase Letter");
			else if ( !hasDigit ) throw new InvalidPasswordException("Password Must contain a Digit");
			else if ( !hasSpeacial ) throw new InvalidPasswordException("Password Must contain a Special Character");
			else {
				if( !pass.equals(upass) ) {
					throw new IncorrectPasswordException("Incorrect Password");
				}
			}
		}catch(InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}catch(IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
