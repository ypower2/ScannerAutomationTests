package com.cisco.automation.pageobjects;

import org.openqa.selenium.WebElement;

import com.cisco.selenium.driver.CWSWebDriver;

public class Page {

	private CWSWebDriver driver;
	
	protected Page(CWSWebDriver driver){
		this.driver = driver;
	}
	
	public CWSWebDriver getDriver() {
		return driver;
	}
	
	private WebElement findByName(String name){
		//driver.
		return null;
	}

}
