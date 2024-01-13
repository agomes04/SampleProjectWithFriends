package com.coding.practice;

public class ArrayPractice {

	public static void main(String[] args) {
		// Break & COntinue
		// int [] x = {10, 20,30};
		String[] names = { "Arif", "Jeff", "Achilles", "Leeana" };

		for (String anyName : names) {
			if (anyName.startsWith("J")) {
				continue;
			}
			System.out.println(anyName);
		}

//			for(String anyName : names) {
//				if(anyName.equals("Achilles")){
//					break;
//				}
//				System.out.println(anyName); 
//			}

	}

}
