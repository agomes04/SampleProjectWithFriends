package com.coding.practice;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in); 
		
		int x = obj.nextInt(); 
		int ans = x;
		
		for(int i=1; i<x; i++) {
			ans = ans*(x-i);
			// ans =5 * (5-1)
			// ans =20 * (5-2)
			// ans =60 * (5-3)
			// ans =120 * (5-4)
		}
		System.out.println(ans);
	}

}
