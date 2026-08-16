package com.JavaTraining.day4;
import java.util.*;
public class ArraylistBubblesort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		int n = sc.nextInt();
		
		for ( int i = 0 ; i < n ; i++ ) {
			int x = sc.nextInt();
			if ( x == - 1 ) break;
			a.add(x);
		}
		
		for ( int i = 0 ; i < a.size() - 1; i++ ) {
			boolean swapped = false;
			
			for ( int j = 0 ; j < a.size() - 1 - i ; j++ ) {
				if ( a.get(j) > a.get(j+1) ) {
					int tmp = a.get(j);
					a.set(j , a.get(j + 1) );
					a.set(j + 1 , tmp );
					
					swapped = true;
				}
			}
			
			if ( !swapped ) break;
		}
		
		System.out.println(a);
	}
}
