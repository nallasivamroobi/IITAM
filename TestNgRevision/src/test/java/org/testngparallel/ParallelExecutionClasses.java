package org.testngparallel;

import org.testng.annotations.Test;

public class ParallelExecutionClasses {

	
	@Test
	public void c1()
	{
		System.out.println("c1 method");
		System.out.println(Thread.currentThread().getId());
	}
	
	
	@Test
	public void c2()
	{
		System.out.println("c2 method");
		System.out.println(Thread.currentThread().getId());
	}
		
}
