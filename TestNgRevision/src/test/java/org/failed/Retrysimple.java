package org.failed;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrysimple  implements IRetryAnalyzer{

	int failCount=0;
	int limit=4;
	
	public boolean retry(ITestResult arg0) {
	
		if(failCount<limit)
		{
			failCount++;
			return true;
		}
		
		return false;
	}

	
}
