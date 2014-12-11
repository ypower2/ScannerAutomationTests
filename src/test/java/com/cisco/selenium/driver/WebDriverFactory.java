package com.cisco.selenium.driver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	
	static CWSWebDriver driver;

	public static CWSWebDriver getDriver(DriverClient driverName){
		if (driverName.equals(DriverClient.FIREFOX)){
			driver = new CWSWebDriver(new FirefoxDriver());
		}
		return driver;
	}
}



