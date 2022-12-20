package org.adactin;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseLibrary {
   
	   public static WebDriver driver;
	   
	   public void openBrowser(String url)
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\AdactinHotel\\Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(url);
	   }
	   
	   public void dropDownIndex(WebElement element,int i)
	   {
		   Select s = new Select(element);
		   s.selectByIndex(i);
	   }
	   
	   public void dropDownValue(WebElement element , String value)
	   {
		    Select s= new Select(element);
		    s.selectByValue(value);
	   }
	   
	   public void dropDownVisibleText(WebElement element , String text)
	   {
		   Select s = new Select(element);
		   s.selectByVisibleText(text);
	   }
	   
	   public void scrollDown(WebElement element)
	   {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].scrollIntoView(true)", element);
				   
	   }
	   
	   
	   
	   
	   
}
