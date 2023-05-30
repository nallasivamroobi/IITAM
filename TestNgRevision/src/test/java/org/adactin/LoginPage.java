package org.adactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass  {

	 public LoginPage() {
	      PageFactory.initElements(driver, this);
	}
	 
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name=\"email\"]")})
	private WebElement txtUserName;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBys({@FindBy(name="pass"),@FindBy(xpath="//input[@id='pass']")})
	private WebElement txtPassWord;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	
}
