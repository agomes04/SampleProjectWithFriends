package com.coding.practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SwitchCaseWithMap {

	public static void main(String[] args) {
			
		Map<String, String> months = new HashMap<String, String>();
		months.put("March", "Spring");
		months.put("April", "Spring");
		months.put("May", "Spring");
		months.put("June", "Summer");
		months.put("July", "Summer");
		months.put("August", "Summer");
		months.put("September", "Fall/Autumn");
		months.put("October", "Fall/Autumn");
		months.put("November", "Fall/Autumn");
		months.put("December", "Winter");
		months.put("January", "Winter");
		months.put("February", "Winter"); 
		
		System.out.println("Enter a month to find out the season");
		
		Scanner scanner = new Scanner(System.in); 
		String userInput = scanner.next();
		
		if(months.containsKey(userInput)) {
			String finalOutput = months.get(userInput); 
			System.out.println(finalOutput);
		}else {
			System.out.println("Please Enter a valid month to find out a valid season");
		}
	}

}
