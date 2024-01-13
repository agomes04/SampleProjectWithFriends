package com.coding.practice;

public class Pallindrome {
	
	public static void main(String[] args) {
		String car = "CIVIC";
		String reverse = ""; 
		
		for(int i=car.length()-1; i>=0; i--) {
			reverse = reverse + car.charAt(i); 
		}
		System.out.println(reverse);
		
		if(reverse.equals(car)) {
			System.out.println("It's a palindrome");
		}else {
			System.out.println("It's NOT a palindrome");
		}
	}
	
//	public static void main(String[] args) {
//		String originalValue = "CIVIC"; 
//		String reverseValue = ""; 
//		
//		for(int i=originalValue.length()-1; i>=0; i--) {
//			reverseValue += originalValue.charAt(i); 
//			System.out.println(reverseValue);
//		}
//		boolean palindrome = true; 
//		for(int i=0; i<originalValue.length(); i++) {
//			if(originalValue.charAt(i) != reverseValue.charAt(i)){
//				palindrome = false; 
//			}
//		}
//		if(palindrome == true) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a Palindrome");
//		}
//	}
	
}
