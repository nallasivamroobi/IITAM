package org.normalprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertBoth {

	  @Test
	  public void tc1()
	  {
		  System.out.println("First method");
		  Assert.assertEquals(true,false);
		  System.out.println("after condition");
		  System.out.println("Program ends");
	  }
	  
	  @Test
	  public void tc2()   
	  {
		  System.out.println("Second method");
		  System.out.println("***************************************");
		  System.out.println("                   tc2                 ");
		  System.out.println("*****************************************");
	  }
}
