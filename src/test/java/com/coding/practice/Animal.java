package com.coding.practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.utility.creation.BaseConfigFile;
import com.utility.creation.SeleniumWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Animal {
	
	public static void main(String[] args) {
		Animal.initializeBrowser(); 
	}
	
	public static WebDriver initializeBrowser()  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.carfax.com/cars-for-sale");
		SeleniumWait.getImplicitWait(driver);
		System.out.println(driver.getTitle());
		
		//Set<String> allWindonws = driver.getWindowHandles(); 
		
		return driver; 
	}
}
