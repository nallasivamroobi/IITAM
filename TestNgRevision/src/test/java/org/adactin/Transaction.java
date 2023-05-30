package org.adactin;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Transaction extends BaseClass {

	BaseClass b = new BaseClass();
//	Scanner s = new Scanner(System.in);

	
	@BeforeClass
	public void openBrowser()
	{
		 
		b.openUrl("https://www.facebook.com/");		
	}
	
	@Test
	
	public void tc1()
	{
		WebElement labelFb = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text = labelFb.getAttribute("title");		
		System.out.println(text);
		LoginPage login = new LoginPage();    	
		WebElement txtUserName = login.getTxtUserName();
		b.enterData(txtUserName, "nallasiva@gmail.com");
		WebElement txtPassWord = login.getTxtPassWord();
		b.enterData(txtPassWord, "1234556565");
		System.out.println(txtUserName.getAttribute("value"));
		System.out.println(txtPassWord.getAttribute("value"));
		WebElement btnLogin = login.getBtnLogin();
		b.clickIt(btnLogin);
		
	}
	
	
}
