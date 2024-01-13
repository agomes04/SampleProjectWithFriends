package com.coding.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SwitchCaseWithWhileLoop {

	public static void main(String[] args) {

		boolean again = true;
		String userInput = null;
		String finalString = null;
		char finalChar; // 
		Scanner scanner = new Scanner(System.in);

		String[][] season = { { "March", "April", "May" }, { "June", "July", "August" },
				{ "September", "October", "November" }, { "December", "January", "February" }, { "" } };

		while (again == true) { // stops when again = false

			System.out.println("Enter a month to find out the season");
			userInput = scanner.next();

			for (int i = 0; i < season.length; i++) {
				for (int j = 0; j < season[i].length; j++) {
					finalString = season[i][j]; //if the user enters a valid month, the season for that month gets stored in finalString
					// System.out.println(finalString);  //prints out if users answer 
					if (userInput.equalsIgnoreCase(finalString)) { //ignore case = ignores uppercase or lowercase. only focuses on letters
						switch (i + 1) {
						case 1:
							System.out.println("Spring");
							break;
						case 2:
							System.out.println("Summer");
							break;
						case 3:
							System.out.println("Fall/Autumn");
							break;
						case 4:
							System.out.println("Winter");
							break;
						default:
							//
						} 
					}
				}if(!userInput.equalsIgnoreCase(finalString)) {
					System.out.println("Please type an actual month!");
				}break; 
			}
			System.out.println("Would you like to enter another month? Please enter Y/N. Thank you");
			finalChar = scanner.next().charAt(0); 
			
			if (finalChar == 'Y' || finalChar == 'y') {
				again = true; 
				//System.out.println("Please type an actual month!");
			} else if (finalChar == 'N' || finalChar == 'n') {
				again = false;
				break; 
			}else {
				System.out.println("Enter Y/N");
			}
		}
		
		System.out.println("Thank you for using our program. See you soon.");
	}

}
