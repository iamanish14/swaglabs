package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;

	public static void browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Swaglabs_demo\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

	}

	public static void navigateurl(String value) {
		driver.get(value);

	}

	public static void sendkeys(WebElement element, String value1) {
		element.sendKeys(value1);

	}

	public static void selected(WebElement element) {
		element.click();
	}

}
