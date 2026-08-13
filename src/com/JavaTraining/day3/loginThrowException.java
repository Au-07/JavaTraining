package com.JavaTraining.day3;

class login{
	String username;
	String password;
	
	login(String username, String password){
		this.username = username;
		this.password = password;
		
	}
	
	void check( String user, String pass)  throws RuntimeException{
		System.out.println( user.equals(username) && pass.equals(password) );
	}
	
	
}
public class loginThrowException {
	public static void main(String[] args) {
		login l = new login("Aish","12Ai");
		
		l.check(null , "Ais");
	}
}
