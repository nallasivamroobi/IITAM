package org.pages;

import org.global.functions.GlobalMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends GlobalMethods {

	    public SearchHotelPage() {
		          
	    	      PageFactory.initElements(driver, this);
		}
	    
	    public WebElement getListLocation() {
			return listLocation;
		}

		public WebElement getListHotels() {
			return listHotels;
		}

		public WebElement getListRoomType() {
			return listRoomType;
		}

		public WebElement getListRoomnumbers() {
			return listRoomnumbers;
		}

		public WebElement getTxtCheckInDate() {
			return txtCheckInDate;
		}

		public WebElement getTxtCheckOutDate() {
			return txtCheckOutDate;
		}

		public WebElement getListAdultsPerRoom() {
			return listAdultsPerRoom;
		}

		public WebElement getListChildPerRoom() {
			return listChildPerRoom;
		}

		public WebElement getBtnSearch() {
			return btnSearch;
		}

		@FindBy(xpath="//select[@name='location']")
	    private WebElement listLocation;
	    
	    @FindBy(xpath="//select[@name='hotels']")
	    private WebElement listHotels;
	    
	    @FindBy(xpath="//select[@name='room_type']")
	    private WebElement listRoomType;
	    
	    @FindBy(xpath="//select[@name='room_nos']")
	    private WebElement listRoomnumbers;
	    
	    @FindBy(xpath="//input[@name='datepick_in']")
	    private WebElement txtCheckInDate;
	    
	    @FindBy(name="//html/descendant::input[@name='datepick_out']")
	    private WebElement txtCheckOutDate;
	    
	    @FindBy(xpath="//select[@name='adult_room']")
	    private WebElement listAdultsPerRoom;
	    
	    @FindBy(xpath="//select[@name='child_room']")
	    private WebElement listChildPerRoom;
	    
	    @FindBy(xpath="//input[@name='Submit']")
	    private WebElement btnSearch;
	    
	    
}
