package org.adactin;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.event.LoggingEvent;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HotelTransactions extends BaseLibrary {

	BaseLibrary b = new BaseLibrary();
	Scanner s = new Scanner(System.in);
	@BeforeClass
	public void openUrl()
	{
	
		b.openBrowser("http://adactinhotelapp.com/");
	}
	 @Test(priority=1)
	 public void loginHotel()
	 {
		 LoginPage login = new LoginPage();		 
		 login.getTxtUserName().sendKeys("xavipik373");
		 login.getTxtPassword().sendKeys("xavipik373");
	     login.getBtnLogin().click();	
	 }
	 
	 @Test(priority=2)
	 public void hotel() throws InterruptedException
	 {
	    SearchHotel s = new SearchHotel();
	    WebElement location = s.getDrdLocation();
	    b.dropDownIndex(location, 2);
	    
	    WebElement hotel = s.getDrdHotelList();
	    b.dropDownVisibleText(hotel, "Hotel Hervey");
	    WebElement drdRoomType = s.getDrdRoomType();
	    b.dropDownValue(drdRoomType, "Double");
	    WebElement numberOfRooms = s.getDrdNumberOfRooms();
	    b.dropDownVisibleText(numberOfRooms, "5 - Five");
	    WebElement txtCheckInDate = s.getTxtCheckInDate();
	    txtCheckInDate.clear();
	    txtCheckInDate.sendKeys("13/06/2021");
	    WebElement txtcheckOutDate = s.getTxtcheckOutDate();
	    txtcheckOutDate.clear();
	    txtcheckOutDate.sendKeys("18/06/2021");
	    WebElement drdAdultsPerRoom = s.getDrdAdultsPerRoom();
	    b.dropDownIndex(drdAdultsPerRoom,1);
	    WebElement drdChildRoom = s.getDrdChildRoom();
	    b.dropDownValue(drdChildRoom,"2");
	    WebElement btnsearch = s.getBtnsearch();
	    btnsearch.click();
	    driver.findElement(By.name("radiobutton_0")).click();
	    driver.findElement(By.name("continue")).click();
	 } 
	 
	 @Test (priority=3)
	 public void billing() throws InterruptedException
	 {
	     BillingPage b1 = new BillingPage();
	     b1.getGetFirstName().sendKeys("Nallasivam");
	     b1.getGetLastName().sendKeys("Roobini");
	     b1.getGetBillingAddress().sendKeys("No.11, Anna nagar,Chennai-600101.");
	     WebElement getCreditCardNumber = b1.getGetCreditCardNumber();
	     Thread.sleep(3000);
	     b.scrollDown(getCreditCardNumber);
	     getCreditCardNumber.sendKeys("1234567890123456");
	     WebElement getCreditCardType = b1.getGetCreditCardType();
	     b.dropDownIndex(getCreditCardType,2);	     
	     WebElement getCreditCardExpiryMonth = b1.getGetCreditCardExpiryMonth();
	     b.dropDownVisibleText(getCreditCardExpiryMonth,"August");
	     WebElement getCreditCardYear = b1.getGetCreditCardYear();
	     b.dropDownValue(getCreditCardYear, "2022");
	    b1.getGetCvvNumber().sendKeys("696");
	    b1.getGetBookNow().click();
	     
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
