package com.omrbranch.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class ExploreHotelPage extends BaseClass {
	
	public ExploreHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@data-testid ='username']")
	private WebElement textWelcome;
	
	public WebElement getTextWelcome() {
		return textWelcome;
	}

	@FindBy(xpath = "//*[@data-href='https://omrbranch.com/hotel-booking']" )
	private WebElement lnkHotel;
	
	@FindBy(xpath = "//*[@class='fliter_box_inner']/h5")
	private WebElement textExploreHotel;
	
	@FindBy(name = "state")
	private WebElement ddnState;
	
	@FindBy(name = "city")
	private WebElement ddnCity;
	
	@FindBy(id = "room_type")
	private WebElement ddnRoomType;
	
	@FindBy(name ="check_in")
	private WebElement txtCheckIn;
	
	@FindBy(xpath = "//a[contains(text(),'12')]")
	private WebElement lnkCheckInDate;
	
	@FindBy(name = "check_out")
	private WebElement txtCheckOut;
	
	@FindBy(xpath = "//a[@class ='ui-state-default'] [contains(text(),'2')]")
	private WebElement lnkCheckOutDate;
	
	@FindBy(name = "no_rooms")
	private WebElement ddnNoOfRooms;
	
	@FindBy(name ="no_adults")
	private WebElement ddnNoOfAdults;
	
	@FindBy(name ="no_child")
	private WebElement ddnNoOfChild;
	
	@FindBy(id ="hotelsearch_iframe")
	private WebElement frameBtnSearch;
	
	@FindBy(xpath = "//*[@id='searchBtn']")
	private WebElement btnSearch;

	public WebElement getLnkHotel() {
		return lnkHotel;
	}

	public WebElement getTextExploreHotel() {
		return textExploreHotel;
	}

	public WebElement getDdnState() {
		return ddnState;
	}

	public WebElement getDdnCity() {
		return ddnCity;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getLnkCheckInDate() {
		return lnkCheckInDate;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getLnkCheckOutDate() {
		return lnkCheckOutDate;
	}

	public WebElement getDdnNoOfRooms() {
		return ddnNoOfRooms;
	}

	public WebElement getDdnNoOfAdults() {
		return ddnNoOfAdults;
	}

	public WebElement getDdnNoOfChild() {
		return ddnNoOfChild;
	}

	public WebElement getFrameBtnSearch() {
		return frameBtnSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	public String getLoginSuccessMessage() {
		
		String text = elementGetText(textWelcome);
		return text;
	}
	
	

}
