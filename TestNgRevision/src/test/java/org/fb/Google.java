package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Google {
 
   public static WebDriver driver;
	 
	@BeforeClass
	public void tc0()
	{
		
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		}
	
	@Test
	public void tc1() throws InterruptedException
	{
		 Point p = driver.findElement(By.name("pass")).getLocation();
		 System.out.println(p);
		 System.out.println("======================");
		 System.out.println(p.getX());
		 System.out.println("\n"+p.getY());
	    	
		 Reporter.log("nallasivam entered it",true);
	
	}
	
}
