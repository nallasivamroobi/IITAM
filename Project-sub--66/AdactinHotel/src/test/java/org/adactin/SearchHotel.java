package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseLibrary {

	public SearchHotel() {
	      PageFactory.initElements(driver, this);
	}
	
	public WebElement getDrdLocation() {
		return drdLocation;
	}

	public WebElement getDrdHotelList() {
		return drdHotelList;
	}

	public WebElement getDrdRoomType() {
		return drdRoomType;
	}

	public WebElement getDrdNumberOfRooms() {
		return drdNumberOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtcheckOutDate() {
		return txtcheckOutDate;
	}

	public WebElement getDrdAdultsPerRoom() {
		return drdAdultsPerRoom;
	}

	public WebElement getDrdChildRoom() {
		return drdChildRoom;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

	@FindBy(name="location")
	private WebElement drdLocation;
	
	@FindBy(name="hotels")
	private WebElement drdHotelList;
	
	@FindBy(name="room_type")
	private WebElement drdRoomType;
	
	@FindBy(name="room_nos")
	private WebElement drdNumberOfRooms;
	
	@FindBy(name="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(name="datepick_out")
	private WebElement txtcheckOutDate;
	
	@FindBy(name="adult_room")
	private WebElement drdAdultsPerRoom;
	
	@FindBy(name="child_room")
	private WebElement drdChildRoom;
	
	@FindBy(name="Submit")
	private WebElement btnsearch;
	
	@FindBy(name="Reset")
	private WebElement btnReset;
}
	
	