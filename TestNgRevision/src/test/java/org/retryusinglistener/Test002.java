package org.retryusinglistener; 

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test002 {

	@Test
	 public void Test1()
	 {  
		System.out.println("First method");
	 Assert.assertEquals(false, true);
	 }
	 
	 @Test
	 public void Test2()
	 {
		 System.out.println("Second method");
	 Assert.assertEquals(false, true);
	 
	 
	 }
}
