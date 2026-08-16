package com.JavaTraining.day5;
class bankAccount{
	int accountNumber;
	String accountHolderName;
	String mobileNumber;
	String accountType;
    double balance;
    
    bankAccount( int accountNumber, String accountHolderName , String mobileNumber , String accountType , double balance ){
    	this.accountNumber = accountNumber;
    	this.accountHolderName = accountHolderName;
    	this.mobileNumber = mobileNumber;
    	this.accountType = accountType;
    	this.balance = balance;
    	System.out.println("Account Details of a customer has been successfully initialized through a constructor");
    }
}

public class ConstructorDemo {
	public static void main(String[] args) {
		bankAccount b1 = new bankAccount(1001 , "Ana" , "9876987656" ,"Savings" , 30000 );
		bankAccount b2 = new bankAccount(1002 , "Rahi" , "9789978967" ,"Current" , 50000 );
		
		
	}
}
