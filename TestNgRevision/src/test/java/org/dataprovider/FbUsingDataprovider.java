package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbUsingDataprovider {

	  public static WebDriver driver;;
@BeforeClass
public void openUrl()
{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
}

 @DataProvider (name="value")
 public Object[][] getData()
 {
	 return new Object [][] {{"nalla@gmail.com","12345"}};
 }
	
 @Test (dataProvider="value")
 public void tc0 (String username, String password)
 {
	 WebElement txtUserName = driver.findElement(By.name("email"));
	 txtUserName.sendKeys(username);
	 WebElement txtPwd = driver.findElement(By.name("pass"));
	 txtPwd.sendKeys(password);
	 WebElement btnLogin = driver.findElement(By.name("login"));
	 btnLogin.click();
 }
			    
}

	   

