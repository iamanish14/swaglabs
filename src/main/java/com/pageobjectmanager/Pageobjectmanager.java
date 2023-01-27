package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.baseclass.baseclass;
import com.locators.Loginpage;

public class Pageobjectmanager extends baseclass {
	public Pageobjectmanager(WebDriver xdriver) {
		this.driver = xdriver;
	}
	private Loginpage login;
	public Loginpage getLogin() {
		if(login==null) {
			login = new Loginpage(driver);
		}
		return login;
	}

}
