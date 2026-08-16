package com.JavaTraining.day5;
class customers{
	private int accountNumber;
	private String accountHolderName;
	private String mobileNumber;
	private String accountType;
    private double balance;
    
    public void setDetails( int accountNumber, String accountHolderName ,  String accountType , double balance ) {
    	this.accountNumber = accountNumber;
    	this.accountHolderName = accountHolderName;
    	this.accountType = accountType;
    	this.balance = balance;
    }
    
    public void setMobileNumber(String mobileNumber ) { this.mobileNumber = mobileNumber; }
    
    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public String getMobileNumber() { return mobileNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    
}
public class SetterRequirement {
	public static void main(String[] args) {
		customers c1 = new customers();
		c1.setDetails(1001 , "Ana" ,"Savings" , 30000);
		c1.setMobileNumber("9999999999");
		customers c2 = new customers();
		c2.setDetails(1002 , "Pirate" , "Current" , 40000);
		c2.setMobileNumber("9898989899");
		
	    customers [] c = {c1 , c2};
		
		for ( int i = 0 ; i < 2 ; i++ ) {
			System.out.println("\nCustomer " + (i + 1) + " : ");
			System.out.println("Account Number : "+  c[i].getAccountNumber() );
	    	System.out.println("Account Holder Name : " + c[i].getAccountHolderName());
	    	System.out.println("Mobile Number : " + c[i].getMobileNumber());
	    	System.out.println("Account Type : " + c[i].getAccountType());
	    	System.out.println("Balance : " + c[i].getBalance());
		}
	}
}
