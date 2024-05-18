package com.codefios.ebilling.smoke;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test2 {
	
	
}
	@Test
	public void abc() {
		driver.get("https://codefios.com/ebilling/");
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_subit")).click();
	}
	
	@Test
	public void test3()	{
		System.out.println("bye");
	}
	@Before
	public void hello() {
		System.out.println("hello");
		
	@After
	public void bye() {
		System.out.println("I am out");
		}
	
	@BeforeClass
	public static void hellog() {
		System.out.println("hello");
		
	@AfterClass
	public static void bey() {
		System.out.println("I am out");
		}
	}

}
