package com.page.factory.creation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath = "//*[@class='mt-3']")
	private WebElement homePageClick;
	
	@FindBy(xpath = "//*[@class='navbar-toggler p-3']")
	private WebElement burgerMenu;
	
	@FindBy(xpath = "//*[contains(@class,'btn btn-outline-dark rounded bg-white m-1 w-100 text-uppercase fs-6 px-0 fw-100 waves-effect')]")
	private WebElement logInButtoon;
	
	@FindBy(xpath = "")
	private WebElement email;
	
	///////////////////////////////////////////////////////
	
	public WebElement getHomePageClick() {
		return homePageClick;
	}

	public WebElement getBurgerMenu() {
		return burgerMenu;
	}

	public WebElement getSignInButtoon() {
		return logInButtoon;
	}

	public WebElement getEmail() {
		return email;
	}
	
	
	
}
