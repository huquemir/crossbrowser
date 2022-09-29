package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.variables.ConfigProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	WebDriver driver;
	
	@Given("^User is opens a browser and navigates to URL$")
	public void user_is_opens_a_browser_and_navigates_to_URL()  {
	    
		if(ConfigProperties.property.get().getProperty("BrowserType").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		} else if (ConfigProperties.property.get().getProperty("BrowserType").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (ConfigProperties.property.get().getProperty("BrowserType").equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
			
		}
	    
		driver.navigate().to("https://www.google.com/");
		driver.quit();
		
	}

	@When("^User clicks on the sign in button$")
	public void user_clicks_on_the_sign_in_button()  {
	    
	    
	}

}
