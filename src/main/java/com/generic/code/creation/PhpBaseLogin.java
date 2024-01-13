package com.generic.code.creation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.page.factory.creation.MasterPageFactory;
import com.utility.creation.BaseConfigFile;
import com.utility.creation.Highlighter;
import com.utility.creation.SeleniumWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpBaseLogin {
	
	public static WebDriver initializeBrowser()  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(BaseConfigFile.getConfigValue("URL"));
		SeleniumWait.getImplicitWait(driver);
		System.out.println(driver.getTitle());
		return driver; 
	}
	public static WebDriver login(WebDriver driver){
		MasterPageFactory mpf = new MasterPageFactory(driver);
		Highlighter.redColor(driver, mpf.getHomePageClick());
		mpf.getHomePageClick().click();

		Highlighter.greenColor(driver, mpf.getBurgerMenu());
		mpf.getBurgerMenu().click();
		
		SeleniumWait.getExplicitWait(driver, mpf.getSignInButtoon());
		Highlighter.blueColor(driver, mpf.getSignInButtoon());
		mpf.getSignInButtoon().click();

//		driver.switchTo().window("???????????"); 

//		mpf.getEmail().sendKeys(BaseConfigFile.getConfigValue("Email"));
//
//		driver.manage().window().maximize();

		return driver; 
	}

}
