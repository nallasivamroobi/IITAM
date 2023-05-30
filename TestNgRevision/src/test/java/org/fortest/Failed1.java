package org.fortest;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

public class Failed1 {

	 @Test ()
	 public void test1()
	 {
		 System.out.println("Starting");
		 assertTrue(false);
		 assertTrue(true);
		 System.out.println("Ending");
	 }
	 
	 @Test()
	 public void t2()
	 {
		 System.out.println("new t2");
		 assertTrue(false);
		 System.out.println("End t2");
	 }
}
