package org.fortest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
   public WebDriver driver;
	 
	 @org.testng.annotations.Test
	 public void login()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.asos.com/");
	 }
	 @org.testng.annotations.Test
	 public void screenShot() throws IOException
	 {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File sc = ts.getScreenshotAs(OutputType.FILE);
		 File f = new File("C:\\Users\\Welcome\\Pictures\\img.jpeg");
		 FileUtils.copyFile(sc, f);
		System.out.println("End");		 
		 
	 }
	 @org.testng.annotations.Test
	 public void scrolldown() throws InterruptedException
	 {
		  Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement lblBlackFriday = driver.findElement(By.xpath("//a[contains(text(),'Black Friday')]"));
		 js.executeScript("arguments[0].scrollIntoView(true)",lblBlackFriday);
		 js.executeScript("arguments[0].click()", lblBlackFriday);
	 }
		 	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
	 
	  
}
