package com.JavaTraining.day5;
class cust{
	private int accountNumber;
	private String accountHolderName;
	private String mobileNumber;
	private String accountType;
    private double balance;
    
    public void setDetails( int accountNumber, String accountHolderName , String mobileNumber , String accountType , double balance ) {
    	this.accountNumber = accountNumber;
    	this.accountHolderName = accountHolderName;
    	this.mobileNumber = mobileNumber;
    	this.accountType = accountType;
    	this.balance = balance;
    }
    
    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public String getMobileNumber() { return mobileNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    
}
public class GetterRequirement {
	public static void main(String[] args) {
		cust c1 = new cust();
		c1.setDetails(1001 , "Ana" , "9876987656" ,"Savings" , 30000);
		cust c2 = new cust();
		c2.setDetails(1002 , "Pirate" , "9678967866" ,"Current" , 40000);
		
	    cust [] c = {c1 , c2};
		
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
