package com.coding.execution.practice;

import org.openqa.selenium.WebDriver;

import com.generic.code.creation.PhpBaseLogin;

public class TestExecutionClass {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable{
		driver = PhpBaseLogin.initializeBrowser(); 
		driver = PhpBaseLogin.login(driver); 
		// why am I storing it in a variable? it works even without it.
		
		driver.quit(); 
	}

}
 