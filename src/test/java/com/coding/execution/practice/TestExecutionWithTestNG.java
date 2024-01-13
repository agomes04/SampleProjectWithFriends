package com.coding.execution.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.code.creation.PhpBaseLogin;

public class TestExecutionWithTestNG {
	static WebDriver driver;
	
	@BeforeTest
	public void getSetUp() throws Throwable {
		driver = PhpBaseLogin.initializeBrowser();
	}
	
	@Test
	public void getTest() throws Throwable{
		driver = PhpBaseLogin.login(driver); 
	}
	
//	@AfterTest
//	public void getCloseDriver() {
//		driver.quit();
//	}
	
}
