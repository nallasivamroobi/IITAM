package org.pages;

import org.global.functions.GlobalMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPage extends GlobalMethods{

	    public BillPage() {
		     PageFactory.initElements(driver, this);
		}
	    
	    public WebElement getTxtFirstname() {
			return txtFirstname;
		}

		public WebElement getTxtLastName() {
			return txtLastName;
		}

		public WebElement getTxtBillingAddress() {
			return txtBillingAddress;
		}

		public WebElement getTxtCreditCardnumber() {
			return txtCreditCardnumber;
		}

		public WebElement getListCreditCardType() {
			return listCreditCardType;
		}

		public WebElement getListCreditCardExpiryMonth() {
			return listCreditCardExpiryMonth;
		}

		public WebElement getListCreditCardExpiredYear() {
			return listCreditCardExpiredYear;
		}

		public WebElement getTxtCVVNumber() {
			return txtCVVNumber;
		}

		public WebElement getBtnBookNow() {
			return btnBookNow;
		}

		@FindBy(xpath="//input[@name='first_name']")
	    private WebElement txtFirstname;
	    
	    @FindBy(xpath="//input[@name='last_name']")
	    private WebElement txtLastName;
	    
	    @FindBy(xpath="//textarea[@name='address']")
	    private WebElement txtBillingAddress;
	    
	    @FindBy(xpath="//input[@name='cc_num']")
	    private WebElement txtCreditCardnumber;
	    
	    @FindBy(xpath="//select[@name='cc_type']")
	    private WebElement listCreditCardType;
	    
	    @FindBy(xpath="//select[@name='cc_exp_month']")
	    private WebElement listCreditCardExpiryMonth;
	    
	    @FindBy(xpath="//select[@name='cc_exp_year']")
	    private WebElement listCreditCardExpiredYear;
	    
	    @FindBy(xpath="//input[@name='cc_cvv']")   
	    private WebElement txtCVVNumber;
	    
	    @FindBy(xpath="//input[@name='book_now']")
	    private WebElement btnBookNow;
	    
	    
	    
	    
	 
}
