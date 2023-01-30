package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.baseclass;

public class Loginpage extends baseclass {
	public Loginpage(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement usernamee;

	@FindBy(id = "password")
	private WebElement passwordd;

	@FindBy(id = "login-button")
	private WebElement loginbuttonn;

	public WebElement getUsernamee() {
		return usernamee;
	}

	public WebElement getPasswordd() {
		return passwordd;
	}

	public WebElement getLoginbuttonn() {
		return loginbuttonn;
	}

}
