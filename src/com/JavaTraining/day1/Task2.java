package com.JavaTraining.day1;
class BankAcc {
    int accNo;
    String custName;
    String accType;
    double bal;

    void create(int no, String name, String type) {
        accNo = no;
        custName = name;
        accType = type;
        bal = 0;
    }

    void deposit(double amt) {
        bal = bal + amt;
        System.out.println(amt + " deposited into Account " + accNo);
    }

    void withdraw(double amt) {
        if (amt <= bal) {
            bal = bal - amt;
            System.out.println(amt + " withdrawn from Account " + accNo);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transfer(BankAcc receiver, double amt) {
        if (amt <= bal) {
            bal = bal - amt;
            receiver.bal = receiver.bal + amt;

            System.out.println(
                "Transferred " + amt +
                " from Account " + accNo +
                " to Account " + receiver.accNo
            );
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Customer: " + custName);
        System.out.println("Type: " + accType);
        System.out.println("Balance: " + bal);
        System.out.println();
    }
}

public class Task2 {
    public static void main(String[] args) {

        BankAcc a1 = new BankAcc();
        BankAcc a2 = new BankAcc();
        BankAcc a3 = new BankAcc();

        a1.create(101, "Ana", "Savings");
        a2.create(102, "Rahiya", "Savings");
        a3.create(103, "Pirate", "Current");

        a1.deposit(10000);
        a2.deposit(5000);
        a3.deposit(8000);

        a1.transfer(a2, 3000);

        a2.withdraw(2000);

        System.out.println("\nFinal Account Details");

        a1.display();
        a2.display();
        a3.display();
    }
}
