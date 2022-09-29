package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.variables.ConfigProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },				
		features = {"Features/"}, 
        glue = {"com.stepdefinitions"}, 
		monochrome = true)

public class MyRunner extends AbstractTestNGCucumberTests {
	
	@Parameters("browserType")
	@BeforeClass
	public static void beforeClass(@Optional("Chrome") String browser) {
		
		ConfigProperties.initializepropertyfile();
		
		if(!browser.equals("param-val-not-found")) {
		
		ConfigProperties.property.get().setProperty("BrowserType", browser);
		}
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	

}
