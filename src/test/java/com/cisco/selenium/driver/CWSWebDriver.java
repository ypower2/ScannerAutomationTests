package com.cisco.selenium.driver;

import org.openqa.selenium.WebDriver;

public class CWSWebDriver {

	private WebDriver driver;

	public CWSWebDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void goTo(String url) {
		driver.get(url);
	}

}
