package com.coding.practice;

import java.util.Scanner;

public class UserInputsString {
	
	public static void main(String[] args) {
		String send;
		
		Scanner obj = new Scanner(System.in); 
		
		System.out.println("Enter your name here");
		
		send = obj.nextLine(); 
		
		System.out.println("Welcome to your new program "+send);
	}
}
