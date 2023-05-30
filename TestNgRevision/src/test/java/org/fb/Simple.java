package org.fb;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple {

	 @BeforeSuite
	 public void beforesuite()
	 {
		 System.out.println("before suite");
	 }

	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("before test");
	 }
	 
	 @BeforeClass
	 public void beforeClass()
	 {
		 System.out.println("before clsss");
	 }
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("bf method");
	 }
	 @Test
	 public void tc33()
	 {
		 System.out.println("Test method");
	 }
	@AfterMethod
	public void afMthot() 
	{
		System.out.println("After method");
	}   
	
	@AfterClass
	public void afterClass2211()             
	{
		System.out.println("After class");    
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test method");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("After suite");
	}
@Test
public void test2()
{
	System.out.println("test 2");
}

@Test
public void test222()
{
	System.out.println("test 33333");
}

}
