package org.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {

	@Test  (groups="m")
	public void m1()
	{
		
		System.out.println("m1");
	}
	
	@Test (groups="m")
		public void m2()
	{
		System.out.println("m2");
	}
	
	@Test (groups="z",dependsOnMethods="m5")
	public void m3()
	{
		System.out.println("a");
	}
	
	@Test 
	public void m5()
	
	{
		Assert.assertEquals(true,true);
	}

}
