package org.fortest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	
	 @Test    
	    public void executSessionOne(){
	            //First session of WebDriver
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	            driver.get("http://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            System.out.println("end of first session");
	        }
	        
	    @Test    
	        public void executeSessionTwo(){
	            //Second session of WebDriver
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("http://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 2");
	        System.out.println("end of second session");
	        }
	        
	    @Test    
	        public void executSessionThree(){
	            //Third session of WebDriver
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNgRevision\\Drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("http://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 3");
	        System.out.println("end of third session");
	        }        
	
	
	
}
