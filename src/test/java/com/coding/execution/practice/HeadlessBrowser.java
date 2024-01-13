package com.coding.execution.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions(); 
		options.addArguments("--headless"); 
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://www.google.com");
		System.out.println("Browser opend successfully");
	}

}
