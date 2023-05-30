package org.normalprograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {

	@Test
	@Parameters({"val1","val2"})
	public void mul(int v , int v1)
	{
		int c = v*v1;
		System.out.println("\n=============Multiplication=================");
		System.out.println("multiply of two numbers is  "+c);
		
	}
}
