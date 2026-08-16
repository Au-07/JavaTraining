package com.JavaTraining.day4;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String e) {
		super(e);
	}
}

class bankacc{
	int bal;
	
	bankacc(int bal) { this.bal = bal; }
	
	void withdraw(int amt) throws InsufficientBalanceException {
		if ( amt > bal ) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}else {
			bal -= amt;
			System.out.println("New Balance : " + bal);
		}
	}
}
public class customException {
	public static void main(String[] args) {
		bankacc b = new bankacc(5000);
		
		try {
			b.withdraw(6000);
		}catch(InsufficientBalanceException a) {
			System.out.println(a.getMessage());
		}
		
		//b.withdraw(6000);
	}

}
