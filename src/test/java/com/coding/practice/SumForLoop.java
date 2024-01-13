package com.coding.practice;

//Write a program to calculate the sum of first 10 natural number.
// 1+2+3+4+5+6+7+8+9+10=?

public class SumForLoop {
	
	public static void main(String[] args) {
		int sum = 0; 
		for(int i=0; i<=10; i++) {
			sum = sum + i; 
		}
		System.out.println(sum);
	}
	
}
