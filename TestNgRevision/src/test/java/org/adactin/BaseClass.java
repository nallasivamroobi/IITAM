package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    
	public void openUrl(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void enterData(WebElement element , String s)
	{
		element.sendKeys(s);
	}
	
	public void clickIt(WebElement element)
	{
		element.click();
	}
	
	
	     
}
