package org.testngparallel;

import org.testng.annotations.Test;

public class ParallelExecutionMethod {
	
	
	@Test
	public void m1() throws InterruptedException
	{
		//Thread.sleep(6000);
		System.out.println("m1");
		System.out.println("m1 method thread  "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void m2() throws InterruptedException
	{
		Thread.sleep(2000);
		 
		System.out.println("m2");
		System.out.println("m2 method thread  "+Thread.currentThread().getId());
	}
	
	@Test
	public void m3() throws InterruptedException
	{
		 
		System.out.println("m3");
		System.out.println("m3 method thread  "+Thread.currentThread().getId());
	}
	

}
