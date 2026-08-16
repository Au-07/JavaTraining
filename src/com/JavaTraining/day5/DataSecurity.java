package com.JavaTraining.day5;
class custAcc{
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
    
    public int getAccNo() { return accountNumber; }
    public String getAccHolName() { return accountHolderName; }
    public String getMobileNo() { return mobileNumber; }
    public String getAccType() { return accountType; }
    public double getBalance() { return balance; }
    
}
public class DataSecurity {
	public static void main(String[] args) {
		custAcc c1 = new custAcc();
		c1.setDetails(1001 , "Ana" , "9876987656" ,"Savings" , 30000);
		custAcc c2 = new custAcc();
		c2.setDetails(1002 , "Pirate" , "9678967866" ,"Current" , 40000);
		
	    custAcc [] c = {c1 , c2};
		
		for ( int i = 0 ; i < 2 ; i++ ) {
			System.out.println("\nCustomer " + (i + 1) + " : ");
			System.out.println("Account Number : "+  c[i].getAccNo() );
	    	System.out.println("Account Holder Name : " + c[i].getAccHolName());
	    	System.out.println("Mobile Number : " + c[i].getMobileNo());
	    	System.out.println("Account Type : " + c[i].getAccType());
	    	System.out.println("Balance : " + c[i].getBalance());
		}
	}

}
