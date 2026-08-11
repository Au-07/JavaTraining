package com.JavaTraining;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ( n <= 1 ) { System.out.println("Not Prime");return; }
		if ( n == 2 ) { System.out.println("Prime"); return; }
		
		for ( int i = 3 ; i*i <= n ; i += 2 ) {
			if ( n % i == 0 ) { System.out.println("Not Prime"); return ; }
		}
		System.out.println("Prime");
		sc.close();
	}
}
