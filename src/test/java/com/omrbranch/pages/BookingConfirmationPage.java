package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmationPage extends BaseClass{
	
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver,this);
	}
	static String bookingId;
	
	@FindBy(xpath ="//*[@class='couppon-code']/strong")
	private WebElement textBookingId;
	
	@FindBy(xpath ="//*[@class='couppon-code']")
	private WebElement textBooking;
	
	@FindBy(xpath ="//*[@class='seccess-box text-center']/p/strong")
	private WebElement textHotelName;
	
	@FindBy(xpath ="//*[@class='btn filter_btn']")
	private List<WebElement> lstBtnList;

	public WebElement getTextBookingId() {
		return textBookingId;
	}

	public WebElement getTextBooking() {
		return textBooking;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public List<WebElement> getLstBtnList() {
		return lstBtnList;
	}
	
	public String getBookingId() {
		bookingId = elementGetText(textBookingId).replace("#","");
		return bookingId;
	}
	
	public String getBookedHotelName() {
		String hotelName = elementGetText(textHotelName);
		return hotelName;
	}
	
	public String getBookingConfirmedText() {
		String bookingConfirmed = elementGetText(textBooking);
		return bookingConfirmed;
	}
	
	public void clickBtnMyBooking() {
		elementClick(lstBtnList.get(1));
	}
}
