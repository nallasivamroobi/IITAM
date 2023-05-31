package org.failed;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunSimple {

	
	   @Test 
	   public void testCase1()
	   {
		    System.out.println("=============");
		   System.out.println("First test case");
		   Assert.assertEquals(true,false);
	   }
	   
	   @Test
	   public void testCase2()
	   {
		   System.out.println("Second test case");
		   Assert.assertEquals(false,true);
	   }
}
