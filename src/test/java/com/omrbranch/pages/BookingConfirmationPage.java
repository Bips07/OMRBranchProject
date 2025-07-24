package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmationPage extends BaseClass{
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//*[@class='couppon-code']/strong")
	private WebElement textBookingId;
	
	@FindBy(xpath ="//*[@class='couppon-code']")
	private WebElement textBooking;
	
	@FindBy(xpath ="//*[@class='seccess-box text-center']/p/strong")
	private WebElement textHotelName;
	
	@FindBy(xpath ="//*[@class='btn filter_btn']")
	private WebElement lstBtnList;

	public WebElement getTextBookingId() {
		return textBookingId;
	}

	public WebElement getTextBooking() {
		return textBooking;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getLstBtnList() {
		return lstBtnList;
	}

}
