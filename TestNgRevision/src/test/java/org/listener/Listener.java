package org.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener  {

	public void onFinish(ITestContext arg0) {				
	}

	public void onStart(ITestContext arg0) {			
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("\nFailure of test cases and its details are : "+result.getName());  		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failure of test cases and its details are : "+result.getName());  		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Skip of test cases and its details are : "+result.getName());  		
	}

	public void onTestStart(ITestResult arg0) {				
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Success of test cases and its details are : "+result.getName());  
	}

	 
	
}
