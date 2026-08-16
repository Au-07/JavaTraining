package com.JavaTraining.day4;
import java.util.*;
public class ArraylistSegregation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> a = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for ( int i = 0 ; i < n ; i++ ) {
			int x = sc.nextInt();
			if ( x == -1 ) break;
			a.add(x);
		}
		
		int curr = 0;
		
		for ( int i = 0 ; i < a.size() ; i++ ) {
			if ( a.get(i) % 10 != 0 ) {
				int tmp = a.get(i);
				for ( int x = i ; x > curr ; x -- ) {
					a.set(x , a.get(x - 1 ));
				}
 
				a.set(curr , tmp);
				curr++;
			}
		}
		
		System.out.println(a);
	}
}
