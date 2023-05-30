package org.listener.secondcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	@Test  
	public void testtopass()  
	{  
		System.out.println("method1");
	Assert.assertTrue(true);  
	}  
	
	@Test  
	public void testtofail()  
	{  
		System.out.println("method2");
	Assert.assertFalse(false);  
	}
}
