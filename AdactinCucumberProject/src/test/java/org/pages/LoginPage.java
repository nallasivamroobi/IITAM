package org.pages;

import javax.xml.xpath.XPath;

import org.global.functions.GlobalMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GlobalMethods {

	public LoginPage() {
	   PageFactory.initElements(driver, this);
	  }
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


	@FindBy(xpath="//input[@name='password']")
    private WebElement password;
	
	@FindBy(xpath="//html/descendant::input[@name='login']")
	private WebElement login;
	
}
