package org.global.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalMethods {

	public static WebDriver driver;
	
	       public void adactinHomePage()
	       {
	    	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\AdactinCucumber\\Drivers\\chromedriver.exe");
	    	      driver = new ChromeDriver();
	    	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	      driver.manage().window().maximize();	    	      
	    	      driver.get("http://adactinhotelapp.com/");
	       }
}
