package com.JavaTraining.day5;
class customers1{
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
    
}
public class SetterNotForEveryMemeber {
	public static void main(String[] args) {
		customers1 c1 = new customers1();
		c1.setDetails(1001 ,"Savings" , 30000);
		c1.setAccountHolderName("Ana");
		c1.setMobileNumber("9999999999");
		
		
		customers1 c2 = new customers1();
		c2.setDetails(1002 , "Current" , 40000);
		c2.setAccountHolderName("Pirate");
		c2.setMobileNumber("9898989899");
		
	    customers1 [] c = {c1 , c2};
		
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
