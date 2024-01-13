package com.coding.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//create an app
//List of products
//accepect product 
//price the product 
//subtotal of the products 
//add tax + display total tax
//display SUBTOTAL 
//customer purchase 
// next customer? boolean yes/no? 

public class Receipt {

	static List<Double> price = new ArrayList<Double>();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String itemInput;
		boolean addItem = true;
		
		while (addItem) {
			System.out.println("Please enter an item");
			itemInput = scanner.next();
			if (itemInput.equalsIgnoreCase("Pen")) {
				price.add(3.0);
			} else if (itemInput.equalsIgnoreCase("Pencil")) {
				price.add(2.0);
			} else if (itemInput.equalsIgnoreCase("paper")) {
				price.add(5.0);
			} else {
				System.out.println("try again");
			}
			System.out.println("Price of " + itemInput + " is " + price);

			System.out.println("Do you wish to add any other item? Enter Y?N");
			String ifAddMoreItem = scanner.next();

			if (ifAddMoreItem.equalsIgnoreCase("Y")) {
				addItem = true;
			} else if(ifAddMoreItem.equalsIgnoreCase("N")){
				price.addAll(price); 
			}else {
				addItem = false;
			}
		}

	}

}
