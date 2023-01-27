package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends baseclass {
	@Before()
	public static void bef() {
		System.out.println("i am hooks");

	}
	@After()
	public static void aft(Scenario scenario) throws InterruptedException {
		Thread.sleep(3000);
		byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "screenshot");
		

	}
	

}
