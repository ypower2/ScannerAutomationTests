package com.cisco.automation.pageobjects.portal;

import com.cisco.automation.pageobjects.Page;
import com.cisco.selenium.driver.CWSWebDriver;

public class LoginPage extends Page {
	
	private String userName;
	
	private String password;
	
	public LoginPage(CWSWebDriver driver) {
		super(driver);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@SuppressWarnings("javadoc")
/*	public ViewCompaniesPage login(String username, String password) {

		enterUsername(username).enterPassword(password).submitPage();
		return new ViewCompaniesPage(webDriver);
	}
	
	private LoginPage enterPassword(String password) {
		type(password, passwordField(PASSWORD));
		return this;
	}

	private LoginPage enterUsername(String username) {
		type(username, inputField(INITIALS));
		return this;
	} */
	

	public void click_forgotten_your_password_link(){
		
	}

	
}
