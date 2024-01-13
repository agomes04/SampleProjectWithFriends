package com.coding.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ifElsePractice {
	
//	public void getAge(){
//		
//		int age = 90; 
//		
//		 if(age < 21) {
//			System.out.println("I can;t buy drink");
//		}else if(age > 65){
//			System.out.println("I'm a senior citizen");
//		}else {
//			System.out.println("I can buy drink");
//		}
//	}
//
//	public static void main(String[] args) {
//		ifElsePractice obj  = new ifElsePractice(); 
//		obj.getAge();
//	}
	
	@Test
	@Parameters(value = "browser")
	public void getBrowser(String browser){
//		String browser = "Chrome"; // Passed into testng.xml
		if (browser.equals("Chrome")) {
			System.out.println("Chrome Starts");
		}else if(browser.contains("Edge")){
			System.out.println("Edge starts");
		}
		else {
			System.out.println("No Browser found");
		}
			
	}

}






















// int and &&
//int or ||
//int equals ==
//int not equals to !=

//String and &&
//String or ||
//String equals to .equalsTo()
//String not equals to .!equalsTo()