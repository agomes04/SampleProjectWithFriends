package com.coding.practice;

import java.util.Arrays;

public class ReverseForLoop {

	public static void main(String[] args) {
		int [] reverseLoopNum = {2,3,4,5,6,7,8,9}; 
		
		//for (data type anyName=end point - 1; anyName>start point; anyName --){}
		
		for(int i=reverseLoopNum.length - 1; i>0; i--) {
			System.out.println(Arrays.toString(reverseLoopNum));
		}
	}

}
