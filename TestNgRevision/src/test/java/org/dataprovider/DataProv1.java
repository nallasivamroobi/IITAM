package org.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv1 {

	  @Test (dataProvider = "value")
	  public void tc0 (int s1 , int s2)
	  {
		  System.out.print(s1+"\t");
		  System.out.println(s2);
		  int c = s1+s2;
		  System.out.println("Sum of above is ----- "+c);
	  }
	  
	  @DataProvider(name="value")
	  public Object[] getData() 
	  {
		  return new Object[][] {{120,60} ,{50,40},{90,200}};
	  }
			    
}
