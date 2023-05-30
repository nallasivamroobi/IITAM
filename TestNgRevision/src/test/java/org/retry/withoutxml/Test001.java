package org.retry.withoutxml;

import org.testng.annotations.Test;
import org.testng.Assert;


public class Test001 {

	@Test (retryAnalyzer=RetryAnalyzer.class)
	 public void Test1()
	 {
		System.out.println("starting test");
	     Assert.assertEquals(true, true);
	     System.out.println("end");
	 }
	 
	 @Test
	 public void Test2()
	 {
		 System.out.println("Test2 ");
	    Assert.assertEquals(true, true);
	    System.out.println(" Test 2 end");
	 }
	
}
