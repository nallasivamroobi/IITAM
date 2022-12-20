package org.stepdef;

import org.global.functions.GlobalMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.BillPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef extends  GlobalMethods{

	  SearchHotelPage h = new SearchHotelPage();
	  SelectHotel h1 = new SelectHotel();
	  BillPage b = new BillPage();
	
	@Given("Enter in to home page")
	public void enter_in_to_home_page() {
	          
		   adactinHomePage();
	}

	@Given("enter username and password")
	public void enter_username_and_password() throws InterruptedException {
	    LoginPage l = new LoginPage();
	    l.getUserName().sendKeys("nalla123");
	    l.getPassword().sendKeys("123ABC");
	    
	    WebDriverWait wt = new WebDriverWait(driver, 15);
	    wt.until(ExpectedConditions.elementToBeClickable(l.getLogin()));
	    Thread.sleep(3000);
	    l.getLogin().click();
     }

	@Then("record the result")
	public void record_the_result() {
	      System.out.println("Login finish");    
	}

	@Then("Select Location name from dropDown")
	public void select_Location_name_from_dropDown() {
	   
        
        Select s = new Select(h.getListLocation());
        s.selectByVisibleText("Adelaide");
	}

	@Then("Select Hotel name from dropDown")
	public void select_Hotel_name_from_dropDown() {
          Select s = new Select(h.getListHotels());
          s.selectByIndex(2);
     	}

	@Then("Select Room type from dropDown")
	public void select_Room_type_from_dropDown() {
	       Select s = new Select(h.getListRoomType()) ;
	       s.selectByValue("Double");
	}

	@Then("Select number of rooms from dropDown")
	public void select_number_of_rooms_from_dropDown() {
	    Select s = new Select(h.getListRoomnumbers());
	    s.selectByIndex(3);		
	}

	@Then("Enter Check in Date")
	public void enter_Check_in_Date() {
		h.getTxtCheckInDate().clear();
	     h.getTxtCheckInDate().sendKeys("22/01/2022");
	 	}

	@Then("Enter check out date")
	public void enter_check_out_date() throws InterruptedException {
		System.out.println("Enterd in this loop  ");
//		h.getTxtCheckOutDate().clear();
//		Thread.sleep(3000);
//	      h.getTxtCheckOutDate().sendKeys("25/01/2022"); 
		WebElement datePickOut = driver.findElement(By.xpath("//html/descendant::input[@name='datepick_out']"));
		datePickOut.clear();
		datePickOut.sendKeys("25/01/2022");
	}

	@Then("select adults per room from drop down")
	public void select_adults_per_room_from_drop_down() {
           Select s = new Select(h.getListAdultsPerRoom());
           s.selectByVisibleText("2 - Two");
		   
	}

	@Then("select children per room from drop down")
	public void select_children_per_room_from_drop_down() {
	       Select s = new Select(h.getListChildPerRoom());
	       s.selectByIndex(1);
	}

	@Then("click search button")
	public void click_search_button() {
	       h.getBtnSearch().click();
	}

	@Given("selecting hotel")
	public void selecting_hotel() {
	    h1.getSelectingHotel().click();
	}

	@Then("Continue the process")
	public void continue_the_process() {
	    h1.getBtnContinue().click();
	}

    //Pay bill and book a hotel
	
	
	@Given("Enter Personal details")
	public void enter_Personal_details() {
	    
		    b.getTxtFirstname().sendKeys("Nallasivam");
		    b.getTxtLastName().sendKeys("Roobini");
		    b.getTxtBillingAddress().sendKeys("no.11, Thiru Vi.ka.Nagar, Chennai-600252");	
	}

	@Then("Give card details")
	public void give_card_details() throws InterruptedException {
	    b.getTxtCreditCardnumber().sendKeys("0987654321456789");
	    Select s = new Select(b.getListCreditCardType());
	    s.selectByIndex(3);
	    Select s1 = new Select(b.getListCreditCardExpiryMonth());
	    s1.selectByValue("6");
	    Select s2 = new Select(b.getListCreditCardExpiredYear());
	    s2.selectByValue("2022");
	    
//	    b.getTxtCVVNumber().clear();
//	    b.getTxtCVVNumber().sendKeys("254");
        WebElement txtCVV = driver.findElement(By.xpath("//html/descendant::table/following-sibling::table/child::tbody/child::tr/following-sibling::tr/descendant::td/child::form/table/tbody/tr[12]/following-sibling::tr/following-sibling::tr[5]/td[2]/child::input[@name='cc_cvv']"));
//        txtCVV.clear();
        txtCVV.sendKeys("125");
	    
	}

	@Then("Book a Room")
	public void book_a_Room() {
		b.getBtnBookNow().click();
		
		WebElement orderno = driver.findElement(By.name("order_no"));
		System.out.println("order number is  "+orderno.getAttribute("value"));
	}


	
	
	
	
}
