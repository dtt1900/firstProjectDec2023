package com.codefios.ebilling.smoke;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginTest {
	static WebDriver driver;
	
	@Test
	public void correctLoginTest1() {
		
				driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
				driver.findElement(By.id("password")).sendKeys("abc123");
				driver.findElement(By.id("login_submit")).click();
	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dttur\\Desktop\\Selenium\\EBilling\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void teardown() {
		driver.close();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dttur\\Desktop\\Selenium\\EBilling\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://codefios.com/ebilling/");
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		//Thread.sleep(5000)
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		
		
		
		
		//negative
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\dttur\\Desktop\\Selenium\\EBilling\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://codefios.com/ebilling/");
		//driver.findElement(By.id("user_name")).sendKeys("jamesbond");
		//driver.findElement(By.id("password")).sendKeys("abc123");
		//driver.findElement(By.id("login_submit")).click();
		//driver.close();
		
		//driver.findElement(By.id("List Accounts")).click();
				//driver.close();
			
				

	}

	private static void LoginTest() {
		// TODO Auto-generated method stub
		
	}

	private static WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
