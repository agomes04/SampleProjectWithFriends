package com.coding.practice;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. 
//It should then print the multiplication table of that number. 

public class UserInputsInt {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x;
		System.out.println("enter # here that you want to multiply with");

		x = obj.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(x + "x" + i + "=" + (x * i));
		}
	}

}
