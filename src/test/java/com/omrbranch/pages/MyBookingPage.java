package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {
	
	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='col-md-5']/h4")
	private WebElement textBookingCount;

	@FindBy(xpath = "//*[@class='form-control w-50 d-inline-block']")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//*[@class='my-booking  prize']/button")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//*[@class='col-md-7 mobile-space-none']/a/h5")
	private WebElement textHotelName;
	
	@FindBy(xpath = "//*[@class='total-prize']")
	private WebElement textHotelPrice;
	
	@FindBy(name = "check_in")
	private WebElement txtCheckIn;
	
	@FindBy(xpath = "//*[@class='edit btn filter_btn']")
	private WebElement btnConfirm;
	
	@FindBy(xpath = "//*[@class='alertMsg']")
	private WebElement textAlertMsg;
	
	@FindBy(xpath ="//*[@class='cancle btn filter_btn']")
	private WebElement btnCancel;
	
	@FindBy(xpath = "//*[@class='cancle btn filter_btn mb-3']")
	private WebElement btnCancelled;

	public WebElement getTextBookingCount() {
		return textBookingCount;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTextHotelPrice() {
		return textHotelPrice;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getTextAlertMsg() {
		return textAlertMsg;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getBtnCancelled() {
		return btnCancelled;
	}
	
}
