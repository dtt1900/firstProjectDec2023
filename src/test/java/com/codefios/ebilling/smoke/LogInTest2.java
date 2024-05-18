package com.codefios.ebilling.smoke;

import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest2 {

	public static void main(String[] args) {
	
		@Before
		
		public void setup(); {
			driver = new ChromeDriver();
			driver.get("https://codefios.com/ebilling/");
			driver.manage().windows().maximize();
			
		}
	}

	private static void setup() {
		// TODO Auto-generated method stub
		
	}

}
