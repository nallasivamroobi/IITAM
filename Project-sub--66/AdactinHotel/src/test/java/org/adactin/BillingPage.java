package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends BaseLibrary {
	
	public BillingPage() {
	
		PageFactory.initElements(driver, this);
	}

	public WebElement getGetFirstName() {
		return getFirstName;
	}

	public WebElement getGetLastName() {
		return getLastName;
	}

	public WebElement getGetBillingAddress() {
		return getBillingAddress;
	}

	public WebElement getGetCreditCardNumber() {
		return getCreditCardNumber;
	}

	public WebElement getGetCreditCardType() {
		return getCreditCardType;
	}

	public WebElement getGetCreditCardExpiryMonth() {
		return getCreditCardExpiryMonth;
	}

	public WebElement getGetCreditCardYear() {
		return getCreditCardYear;
	}

	public WebElement getGetCvvNumber() {
		return getCvvNumber;
	}

	public WebElement getGetBookNow() {
		return getBookNow;
	}

	@FindBy(name="first_name")
	private WebElement getFirstName;
	
	@FindBy(name="last_name")
	private WebElement getLastName;
	
	@FindBy(name="address")
	private WebElement getBillingAddress;
	
	@FindBy(name="cc_num")
	private WebElement getCreditCardNumber;
	
	@FindBy(name="cc_type")
	private WebElement getCreditCardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement getCreditCardExpiryMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement getCreditCardYear;
	
	@FindBy(name="cc_cvv")
	private WebElement getCvvNumber;
	
	@FindBy(name="book_now")
	private WebElement getBookNow;
	
	
}
