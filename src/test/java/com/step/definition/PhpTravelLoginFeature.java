package com.step.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.utility.creation.BaseConfigFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravelLoginFeature {
	WebDriver driver; 
	
	@Given("launch the browser")
	public void launch_the_browser() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}

	@When("send the URL")
	public void send_the_url() throws Throwable {
		driver.get(BaseConfigFile.getConfigValue("URL"));
	}

	@When("click on pop-up")
	public void click_on_pop_up() {
	    
	    
	}

	@When("click on Sign In button")
	public void click_on_sign_in_button() {
	    
	    
	}

	@When("send valid User Name")
	public void send_valid_user_name() {
	    
	    
	}

	@When("send valid password")
	public void send_valid_password() {
	    
	    
	}
	
	@When("click on Submit In button")
	public void click_on_Submit_In_button() {
	    
	    
	}

	@Then("validate successful Log In")
	public void validate_successful_log_in() {
	    
	    
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
}
