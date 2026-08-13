package com.JavaTraining.day3;

import java.util.Scanner;

public class exceptionDemo {
    public static void main(String[] args) {
    	Scanner sc =  new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();

        try {
	        System.out.println(a / b);
	    } catch (ArithmeticException e) {
	        System.out.println("ArithmeticException : cannot divide by 0");
	    }


        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException : Accessing null element" );
        }

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : Index Doesnt exist");
        }
    }
}

