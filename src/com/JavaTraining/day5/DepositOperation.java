package com.JavaTraining.day5;

class custom{
	private int accountNumber;
	private String accountHolderName;
	private String mobileNumber;
	private String accountType;
    private double balance;
    
    public void setDetails( int accountNumber,  String accountType , double balance ) {
    	this.accountNumber = accountNumber;
    	this.accountType = accountType;
    	this.balance = balance;
    }
    
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public void setMobileNumber(String mobileNumber ) { this.mobileNumber = mobileNumber; }
    
    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public String getMobileNumber() { return mobileNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    
    double deposit(double amount) {
    	if ( amount <= 0 ) System.out.println("Invalid Deposit Amount");
    	else balance += amount;
    	return amount;
    }
    
}

public class DepositOperation {
	public static void main(String[] args) {
		custom c1 = new custom();
		c1.setDetails(1001 ,"Savings" , 30000);
		c1.setAccountHolderName("Ana");
		c1.setMobileNumber("9999999999");
		
		
		custom c2 = new custom();
		c2.setDetails(1002 , "Current" , 40000);
		c2.setAccountHolderName("Pirate");
		c2.setMobileNumber("9898989899");
		
		int j = 1000;
		
	    custom [] c = {c1 , c2};
		
		for ( int i = 0 ; i < 2 ; i++ ) {
			System.out.println("\nCustomer " + (i + 1) + " : ");
			System.out.println("Account Number : "+  c[i].getAccountNumber() );
	    	System.out.println("Account Holder Name : " + c[i].getAccountHolderName());
	    	System.out.println("Mobile Number : " + c[i].getMobileNumber());
	    	System.out.println("Account Type : " + c[i].getAccountType());
	    	
	    	System.out.println("Initial Balance : " + c[i].getBalance());
	    	System.out.println("Deposit : " + c[i].deposit(j) );
	    	System.out.println("Final Balance : "+ c[i].getBalance());
	    	
	    	j+=1000;
		}
	}
}
