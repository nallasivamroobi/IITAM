package org.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTitle {

//	public static WebDriver driver;
    // Saving the expected title of the Webpage
  //  String title = "ToolsQA - Demo Website For Automation";
   
    @Test   (groups = { "demo" })
    public void tc0()
    {
    	System.out.println("first method");
         
    }
    
    
    @Test(groups = { "demo1" }) 
    public void checkTitle() {  
      System.out.println("second method");
    } 
    
    @Test(groups = { "demo" })  
    public void click_element() {
    	
    	System.out.println("third method");
    	
    }
    @Test (groups= {"demo"})
    public void tc5()
    {
    	System.out.println("tc5");
    }
    
    @Test (groups= {"demo"})
    public void tc6()
    {
    	System.out.println("tc6");
    }
    @Test (groups= {"demo1"})
    public void tc7()
    {
    	System.out.println("tc7");
    }
}
