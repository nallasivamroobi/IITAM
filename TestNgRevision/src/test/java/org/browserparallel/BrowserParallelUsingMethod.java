package org.browserparallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserParallelUsingMethod {

	public WebDriver driver;
	
	@Test
	public void chromeBrowser() throws InterruptedException
	{			
		System.out.println("Chrome started");
		System.out.println(Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.close();
	}
	
	@Test
	public void firefoxBrowser()
	{
		System.out.println("firefox started");
		System.out.println(Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	
	
	
	
}
