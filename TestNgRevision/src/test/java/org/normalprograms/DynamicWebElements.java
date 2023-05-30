package org.normalprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicWebElements {
	
	public WebDriver driver;
	
 
	
	@Test(enabled=false)
	public void dynamicWebElements() throws InterruptedException, AWTException	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
		Thread.sleep(2000);
	}
	
	@Test(enabled=false)
	public void clickingLinks() throws AWTException, InterruptedException
	{
		Actions ac = new Actions(driver);
		Robot ro = new Robot();
		
		for(int i=2;i<=5;i++)
		{
			WebElement link1 = driver.findElement(By.xpath("//table[@id='table1']/child::tbody/child::tr["+i+"]/td/child::a"));
			ac.contextClick(link1).perform();
			ro.keyPress(KeyEvent.VK_DOWN);
			ro.keyRelease(KeyEvent.VK_DOWN);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}
	}
		
    @Test(enabled=false)
    public void printingSportGameNames() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
		Thread.sleep(2000);
		
		for(int i=1;i<=5;i++)
		{
			 List<WebElement> li = driver.findElements(By.xpath("//table[@id='table2']/child::tbody/child::tr["+i+"]/child::td"));
			     
			    for(int j=0;j<li.size();j++)
			      {
			    	    System.out.print(li.get(j).getText()+"    ");
			      }
			     System.out.println();
		}	
		
    }
		
	
    @Test
    public void guru99WebTable() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(4000);
		
		List<WebElement> li = driver.findElements(By.xpath("//table/child::thead/following-sibling::tbody/child::tr"));
		int rows = li.size();
		
		for(int i=1;i<=rows;i++)
		{
		     List<WebElement> li1 = driver.findElements(By.xpath("//table/child::thead/following-sibling::tbody/child::tr["+i+"]/child::td"));
		     int k=1;
			     for(int j=0;j<li1.size();j++)
			     {
			    	 
			    	  String text = li1.get(j).getText();
			    	  if(k==1)
			    	  {
			    		  if(!(text.contains("Petro")))
			    		  {
			    			 break; 
			    		  }
			    	  }
			    	  
			    	   System.out.print(text+"      ");
			    	  
			    	  k++;
			     }
		 
		   
			     System.out.println();
		}
		
    }
		
	 	
		
		 
		
	}
		
	
	