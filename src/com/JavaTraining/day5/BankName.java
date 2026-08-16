package com.JavaTraining.day5;
class bank{
	String b_name;
	int e_id;
	
	bank(int e_id , String b_name){
		this.e_id = e_id;
		this.b_name = b_name;
		System.out.println("\nAccount ID : " + e_id);
		System.out.println("Bank Name : " + b_name);
	}
}
public class BankName {
	static String bankName = "Mariamman Indian Bank";
	public static void main(String[] args) {
	
		bank b1 = new bank(101 , bankName);
		bank b2 = new bank(102 , bankName);
		bank b3 = new bank(103 , bankName);
	}

}
