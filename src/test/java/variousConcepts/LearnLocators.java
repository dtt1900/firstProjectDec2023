package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	//7th thing
	WebDriver driver; // make a global declaration after setting up the local method below,
					//Once set up remove the local method below (just WebDriver)
	
	
	//5th thing
	@Before
	//1st thing method setup()
	public void setup() {
		//6th driver path/setProperty(get chrome driver from folder rt click properties any of the options below will work.
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dttur\\Desktop\\Selenium\\EBilling\\driver1\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\driver1\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "driver1\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver1/chromedriver.exe");
		//2nd thing get driver and import
		//WebDriver driver = new ChromeDriver();//still need to set driver path(see above to set path)
		//Make sure to delete all cookies and clear catch.
		//rename WebDriver driver = new ChromeDriver(); to just driver=new Chromedriver(); after global method established.
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//TimeUnit is a class
		
		
		
	}
	
	//4th thing, add JUnit Lib will auto import
	@Test
	
	//3rd thing 
	public void testLocators() { // no ";"
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		//rt click on item you want to up load, properties, and get the following.
		//Upload address is folder name, file name and extension (ie-.txt, .pptx)
		//When using .className with "input" tag use .sendKeys
		//When using .className without "input" tag use "Robot" class
		//driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\dttur\\Desktop\\New folder (2)\\GoToMeeting 003.png");
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back(); //to go back to previous web page
		driver.findElement(By.partialLinkText("Backend")).click(); //the partial link must be unique or will get 1st of index.
		driver.navigate().back();
		
		//CSS Selector
		driver.findElement(By.cssSelector("input#profession-1")).click();
		driver.findElement(By.cssSelector("input.input-file")).sendKeys("C:\\Users\\dttur\\Desktop\\New folder (2)\\GoToMeeting 003.png");
		//driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		//below is same as above by searching two not one (above comment out)
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/']")).click();
		driver.navigate().back();
		
		//xPath
		//Below is "absolute" not used, but maybe interview question
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");
		
		
	}
}
