package com.coding.practice;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		int [] arrarName = {34,56,78,89,45,34,56,67}; 
		
		Arrays.stream(arrarName).forEach(abc -> System.out.println(abc));
	}

}
