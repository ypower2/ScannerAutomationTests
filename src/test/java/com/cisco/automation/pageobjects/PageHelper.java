package com.cisco.automation.pageobjects;

import com.cisco.automation.pageobjects.portal.LoginPage;
import com.cisco.selenium.driver.CWSWebDriver;
import com.cisco.selenium.driver.DriverClient;
import com.cisco.selenium.driver.WebDriverFactory;

public class PageHelper {

	private static final String LOGIN_URL = "https://10.10.1.20/portal/admin/login.jsp";

	/**
	 * 
	 * @return LoginPage
	 */
	public static LoginPage login() {

		CWSWebDriver driver = WebDriverFactory
				.getDriver(DriverClient.FIREFOX);

		driver.goTo(LOGIN_URL);
		return new LoginPage(driver);
	}
}
