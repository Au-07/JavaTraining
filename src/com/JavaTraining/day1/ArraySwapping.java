package com.JavaTraining.day1;
import java.util.*;
public class ArraySwapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0 ; i < n ; i++ ) a[i] = sc.nextInt();
		int curr = 0;
	
		
		for ( int swap = 1 ; swap < n ; swap++ ) {
			if( a[swap] % 10 != 0 ) {
				int t = a[curr];
				a[curr] = a[swap];
				a[swap] = t;
				curr++;
				
			}
			
		}
		
		for ( int i : a ) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
