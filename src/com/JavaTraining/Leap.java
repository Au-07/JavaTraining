package com.JavaTraining;
import java.util.*;
public class Leap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		if (  y > 999 && y < 10000  ) {
			if ( m > 0 && m < 13 ) {
				if ( (d > 0 && d < 32) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )) System.out.println("Valid");
				else if( (d > 0 && d < 31 ) && (m == 4 || m == 6 || m == 9 )) System.out.println("Valid");
				else if( (d > 0 && d < 29) && m == 2 ) System.out.println("Valid");
				else if( d == 29 && m == 2 ) {
					if ( y % 400 == 0 || ( y % 4 == 0 && y % 100 != 0) ) System.out.println("Valid");
					else System.out.println("Invalid Date");
				}
				else System.out.println("Invalid Date");
				
			}
			else System.out.println("Invalid Month");	
		}
		else System.out.println("Invalid Year");
	
		
	}
}
