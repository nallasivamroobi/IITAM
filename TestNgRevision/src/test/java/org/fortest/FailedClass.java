package org.fortest;

import static org.junit.Assert.assertTrue;

import org.retry.withoutxml.RetryAnalyzer;
import org.testng.annotations.Test;

public class FailedClass {

	 @Test (retryAnalyzer=Retry.class)
	 public void test1()
	 {
		 System.out.println("Starting");
		 assertTrue(false);
		 assertTrue(true);
	 }
	 
	 @Test(retryAnalyzer=Retry.class)
	 public void t2()
	 {
		 assertTrue(false);
	 }
	 
}
