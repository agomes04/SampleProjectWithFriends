package com.coding.execution.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserWithTestNG {
	
	@Test
	@Parameters(value = "browser")
	public void openBroswer(String value){
		
		if(value.contains("Edge")) {
			// Open Edge
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver(); 
			driver.get("https://automationexercise.com/");
		}else if(value.contains("Chrome")) {
			// Open Chrome
		}else if(value.contains("Safari")) {
			// Open Safari
		}else {
			System.out.println("Parameter is NOT initialized in .xml file");
		}
	}
	
	
}
