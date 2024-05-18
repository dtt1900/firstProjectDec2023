package com.codefios.ebilling.smoke;

import org.openqa.selenium.WebDriver;

public class Setup {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dttur\\Desktop\\Selenium\\EBilling\\driver\\chromedriver.exe");
	}

}
