package org.fortest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int count=0 , limit=4;
		
	public boolean retry(ITestResult result) {
		
		if(count<limit)
		{
			count++;
			return true;
		}
		return false;
	}
}
