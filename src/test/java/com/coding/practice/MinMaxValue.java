// Find out second max value form an Array. 

package com.coding.practice;

import java.util.Arrays;

public class MinMaxValue {

	public static void main(String[] args) {
		int [] value = {39,58,68,29,85,86,02,86,94,58};
		
		int minValue = Arrays.stream(value).min().getAsInt(); 
		int maxValue = Arrays.stream(value).max().getAsInt();
		
		System.out.println("Minimun value = "+ minValue);
		System.out.println("Maximum value = "+ maxValue);
		
		// up to Java 7 condition = if/else
		// After Java 8 condition = filter
		
		int secondMaxValue = Arrays.stream(value).filter(secondMaximumValue -> secondMaximumValue<maxValue).max().getAsInt();
		System.out.println("Second Max value = "+secondMaxValue);
		
		int secondMinValue = Arrays.stream(value).filter(secondMinimumValue -> secondMinimumValue> minValue).min().getAsInt();
		System.out.println("Second Minimum Value = "+ secondMinValue);
	}

}
