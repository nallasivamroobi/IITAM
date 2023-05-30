package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OutsideClassUsingDP extends FbUsingDataprovider {

	    @Test (dataProvider="value" , dataProviderClass=FbUsingDataprovider.class)
	    public void loginFacebook(String userName1,String passWord1)
	    {
	    	System.out.println("\nthis is outside class");
	    	WebElement txtUserName = driver.findElement(By.name("email"));
	   	 txtUserName.sendKeys(userName1);
	   	 WebElement txtPwd = driver.findElement(By.name("pass"));
	   	 txtPwd.sendKeys(passWord1);
	   	 System.out.println("middle of the pgm");
	   	 WebElement btnLogin = driver.findElement(By.name("login"));
	   	 btnLogin.click();
	   	 System.out.println("End of the prm");
	    }
}
