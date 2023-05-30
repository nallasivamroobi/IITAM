package org.normalprograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProgForOptional {
	  
	
	@Test
	  @Parameters ("n1")
	
	  public void tc3   (@Optional ("Roobini") String s)
	   {
		    System.out.println("\nwhat value will come here   "+s);
		  
	  }
	
	
	@Test
	  @Parameters ("n1")
	
	  public void tc31   (@Optional ("Roob") String s)
	   {
		    System.out.println("\nwhat value will come here   "+s);
		  
	  }
	
	
	
}
