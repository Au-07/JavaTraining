package com.JavaTraining.day5;

class custome{
	int accountNumber;
	String accountHolderName;
	String mobileNumber;
	String accountType;
    double balance;
    
    custome( int accountNumber, String accountHolderName , String mobileNumber , String accountType , double balance ){
    	this.accountNumber = accountNumber;
    	this.accountHolderName = accountHolderName;
    	this.mobileNumber = mobileNumber;
    	this.accountType = accountType;
    	this.balance = balance;
    }
    
    void display() {
    	System.out.println("Account Number : "+  accountNumber );
    	System.out.println("Account Holder Name : " + accountHolderName);
    	System.out.println("Mobile Number : " + mobileNumber);
    	System.out.println("Account Type : " + accountType);
    	System.out.println("Balance : " + balance);
    }
}
public class CustomerAccInfo {
	public static void main(String[] args) {
		custome c1 = new custome(1001 , "Ana" , "9876987656" ,"Savings" , 30000 );
		custome c2 = new custome(1002 , "Rahi" , "9789978967" ,"Current" , 50000 );
		
		custome [] c = {c1 , c2};
		
		for ( int i = 0 ; i < 2 ; i++ ) {
			System.out.println("\nCustomer " + (i + 1)  + " : ");
			c[i].display();
		}		
		
	}

}
