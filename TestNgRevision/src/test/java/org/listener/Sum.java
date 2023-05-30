package org.listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.listener.Listener.class)  

public class Sum {

	@Test (priority=-1) 
	public void sum1()  
	{  
	int sum=0;  
	int a=5;  
	int b=7;  
	sum=a+b;  
	System.out.println("addition value is   "+sum);  
	}  
	
	@Test()
	public void dummy()
	{
		System.out.println("Just dummy method");
	}
	
	@Test  
	public void testtofail()  
	{  
	System.out.println("Sum class :   Test case has been failed");  
	Assert.assertTrue(false);  
	}  
}
