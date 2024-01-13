package com.coding.practice;

import java.util.Scanner;

import org.openqa.selenium.InvalidArgumentException;

public class Receipt2 {

	public static void main(String[] args) {
		String item1;
		String item2;
		String item3;

		double price1;
		double price2;
		double price3;
		
		boolean tryAgain = true; 
		
		Scanner scanner = new Scanner(System.in);
		
		while(tryAgain == true) {
			 
			try {
				System.out.println("Please enter item one: pen or pencil or paper");
				item1 = scanner.next();
				price1 = getPrice(item1); // double or exception 
				tryAgain = false;
			} catch(InvalidArgumentException ex){
				tryAgain = true; 
				System.out.println("Please read the instruction again and enter the correct item.");
			}
		}
		
		while(tryAgain){
			
			try {
				System.out.println("Please enter item two: pen or pencil or paper");
				item2 = scanner.next();
				price2 = getPrice(item2);
				tryAgain = false; 
			} catch(InvalidArgumentException ex) {
				tryAgain = true; 
				System.out.println("Please read the instruction again and enter the correct item.");
			}
		}

		

		System.out.println("Please enter item three: pen or pencil or paper");
		item3 = scanner.next();
		price3 = getPrice(item3);

//		System.out.println(price1);
//		System.out.println(price2);
//		System.out.println(price3);
		
		
	}

	/*
	 * static double getPrice(String item) {
	 * 
	 * double price = 0;
	 * 
	 * if (item.equalsIgnoreCase("Pen")) { price = 3; } else if
	 * (item.equalsIgnoreCase("Pencil")) { price = 2; } else if
	 * (item.equalsIgnoreCase("Paper")) { price = 5; } else { throw new
	 * InvalidArgumentException("Item given not found: " + item); } return price; }
	 */

	static double getPrice(String item) {

		if (item.equalsIgnoreCase("Pen")) {
			return 3;
		} else if (item.equalsIgnoreCase("Pencil")) {
			return 2;
		} else if (item.equalsIgnoreCase("Paper")) {
			return 5;
		} else {
			throw new InvalidArgumentException("Item given not found" + item);
		}
	}

}
