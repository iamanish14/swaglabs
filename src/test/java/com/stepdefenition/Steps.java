package com.stepdefenition;

import com.baseclass.baseclass;
import com.pageobjectmanager.Pageobjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends baseclass {
	Pageobjectmanager obj = new Pageobjectmanager(driver);
	
	
	@Given("user launch the {string} browser")
	public void user_launch_the_browser(String string) {
		browserlaunch(string);
	    
	}

	@Given("user navigate to the url {string}")
	public void user_navigate_to_the_url(String string) {
		navigateurl(string);
	    
	}

	@Given("user enter the username as {string}")
	public void user_enter_the_username_as(String string) {
		sendkeys(obj.getLogin().getUsernamee(), string);
	    
	}

	@Given("user enter password as {string}")
	public void user_enter_password_as(String string) {
		sendkeys(obj.getLogin().getPasswordd(), string);
	    
	}

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		selected(obj.getLogin().getLoginbuttonn());
		
	    
	}


}
