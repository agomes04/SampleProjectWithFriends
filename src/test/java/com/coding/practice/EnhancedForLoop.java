package com.coding.practice;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int [] numbers = {3,5,6,8,9,23,45}; 
		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		// Enhanced For Loop
		for(int anyName:numbers) {
			System.out.println(anyName);
		}
	}

}
