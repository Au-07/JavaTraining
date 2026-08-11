package com.JavaTraining;
import java.util.*;
public class Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd = 0; int even = 0;
		int pos = 1;
		while ( n >= pos ) {
			pos *= 10;
		}
		pos /= 10;
		
		while( pos > 0 ) {
			int dig = ( n / pos ) % 10;
			if ( dig % 2 == 0 ) even = even * 10 + dig;
			else odd = odd * 10 + dig;
			pos /= 10;
		}
		
		
		int diff = odd - even;
		
		System.out.println( "Abs. diff = " + Math.abs(diff) );
		sc.close();
	}
}
