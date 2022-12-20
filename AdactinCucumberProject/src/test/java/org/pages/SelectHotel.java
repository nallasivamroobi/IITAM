package org.pages;

import org.global.functions.GlobalMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends GlobalMethods{

	public SelectHotel() {
	       PageFactory.initElements(driver,this);
	  	}
	


	public WebElement getSelectingHotel() {
		return selectingHotel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}



	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectingHotel;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement btnContinue;
	
}
  
