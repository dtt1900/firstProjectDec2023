package com.codefios.ebilling.smoke;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateHW1 {

		WebDriver driver;
		
		@Before
		public void setup() {
			
			//6th driver path/setProperty(get chrome driver from folder rt click properties any of the options below will work.
			//System.set must be above WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dttur\\Desktop\\Selenium\\EBilling\\driver1\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://codefios.com/ebilling/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			}
		
		@Test
		public void testLocators() {
			driver.findElement(By.name("user_name")).sendKeys("demo@codefios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.id("login_submit")).click();
			driver.findElement(By.cssSelector("a[href$='https://codefios.com/ebilling/admin/client/companylist']")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'Add Company')]")).click();
			driver.findElement(By.xpath("//a[contains(text('Add Company'),'Add Company')]")).click();
			//driver.findElement(By.cssSelector("type='button'")).click();
			//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
			//driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click();
			//driver.findElement(By.xpath("//strong[contains(text(), 'New Page')]")).click();
			
			
			
		}
}
