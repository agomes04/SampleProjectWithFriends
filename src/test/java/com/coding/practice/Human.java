package com.coding.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Human extends Animal {
		
	
	@Test
	@Parameters(value = "browser")
	public static void getBrowser(String browser){
		if(browser.equals("Chrome")) {
			System.out.println("CHrome will start");
		}else if (browser.contains("Edge")){
			System.out.println("Edge will start");
		}else {
			System.out.println("Nothing will start");
		}
	}
}
