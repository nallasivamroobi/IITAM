package org.normalprograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class openBrowser {

   @Test (priority=-9)
    @Parameters ({"val1", "val2"})
   
    public void Sum(int v1, int v2) 
   {
     int finalsum = v1 + v2;
     System.out.println("\n===================Addition========================");
        System.out.println("The final sum of the given values is " + finalsum);
    }
	
   @Test
   @Parameters ({"val1", "val2"})
   public void Diff (int v1, int v2) {
    int finaldiff = v1 - v2;
    System.out.println("\n===================Subtraction========================");
    System.out.println("The final difference of the given values is " + finaldiff);
   }    
}
