package com.codefios.ebilling.smoke;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWXpath1 {
	
		WebDriver driver;
		
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver1/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void XPath() {
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//*[@name='firstname']))
		driver.findElement(By.xpath("//*[@id='sex-1']")).click();
		//WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'OS-API Product FrontEnd')]"));
		driver.findElement(By.xpath("//a[text()='OS-API Product FrontEnd']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Backend')]")).click();


		
	}
}
	
