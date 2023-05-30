package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
 
	 public static WebDriver driver;
	
	 @BeforeClass
	    public void browserOpen()
	    {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
	    }
	 
	 @Parameters("username")
	  @Test
	  public void tc0(String userid)
	  {
		    WebElement txtUserName = driver.findElement(By.name("email"));
		    txtUserName.sendKeys(userid);
	 	  }
	 
	 @Parameters("password")
	  @Test
	  public void tc1(String pwd)
	  {
		    WebElement txtPwd = driver.findElement(By.name("pass"));
		    txtPwd.sendKeys(pwd);
		    driver.findElement(By.name("login")).submit();
	  }
}
