package com.utility.creation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	
	WebDriver driver; 
	
	public static void getImplicitWait(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void getExplicitWait(WebDriver driver, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9)); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
