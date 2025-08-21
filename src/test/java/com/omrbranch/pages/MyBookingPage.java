package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.stepdefinition.TC004_BookHotelStep;

public class MyBookingPage extends BaseClass {

	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='col-md-5']/h4")
	private WebElement textBooking;

	@FindBy(xpath = "//*[@class='form-control w-50 d-inline-block']")
	private WebElement txtSearch;

	@FindBy(xpath = "//*[@class='my-booking  prize']/button")
	private List<WebElement> btnEdit;

	@FindBy(xpath = "//*[@class='col-md-7 mobile-space-none']/a/h5")
	private List<WebElement> lstHotelName;

	@FindBy(xpath = "//div[@class='room-code']/span")
	private List<WebElement> lstBookingId;

	@FindBy(xpath = "//*[@class='total-prize']")
	private List<WebElement> lstHotelPrice;

	@FindBy(name = "check_in")
	private WebElement txtCheckIn;

	@FindBy(xpath = "//*[@class='edit btn filter_btn']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//*[@class='alertMsg']")
	private WebElement textAlertMsg;

	@FindAll({ @FindBy(xpath = "//div[@class='my-booking  prize']/*[contains(text(),'Cancel')]") })
	private List<WebElement> btnCancel;

	@FindBy(xpath = "//*[@class='cancle btn filter_btn mb-3']")
	private WebElement btnCancelled;

	public WebElement getTextBooking() {
		return textBooking;
	}

	public List<WebElement> getTextBookingId() {
		return lstBookingId;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public List<WebElement> getBtnEdit() {
		return btnEdit;
	}

	public List<WebElement> getTextHotelName() {
		return lstHotelName;
	}

	public List<WebElement> getTextHotelPrice() {
		return lstHotelPrice;
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

	public List<WebElement> getBtnCancel() {
		return btnCancel;
	}

	public WebElement getBtnCancelled() {
		return btnCancelled;
	}

	public String getBookingText() {
		String text = elementGetText(textBooking).substring(0, 8);
		return text;
	}

	public void searchBookingId() {
		elementSendKeys(txtSearch, TC004_BookHotelStep.bookingId);
	}

	public void changeBookingDate(String newDate) {
		elementClear(txtCheckIn);
		elementSendKeys(txtCheckIn, newDate);
		elementClick(btnConfirm);
	}

	public void clickBtnEdit() {
		elementClickJS(btnEdit.get(0));
	}

	public String getMessage() {
		String text = elementGetText(textAlertMsg);
		return text;
	}

	public String getHotelName() {
		String text = elementGetText(lstHotelName.get(0));
		return text;
	}

	public String getHotelPrice() {
		String text = elementGetText(lstHotelPrice.get(0)).replace("Rs", "").strip();
		return text;
	}

	public String getBookingId() {
		String text = elementGetText(lstBookingId.get(0)).replace("#", "");
		return text;
	}

	public void searchBookingId(String orderId) {
		elementSendKeys(txtSearch, orderId.replace("#", ""));
	}

	public void selectFirstHotel() {
		elementClickJS(btnEdit.get(0));
	}

	public void selectLastHotel() {
		int lastIndex = btnEdit.size() - 1;
		elementClickJS(btnEdit.get(lastIndex));
	}

	public void clickCancel() {
		elementClickJS(btnCancel.get(0));
	}

	public void cancelFirstHotel() {
		for (WebElement cancel : btnCancel) {
			if (!(elementGetText(cancel).equals("Cancelled"))) {
				elementClickJS(cancel);
				break;
			}
		}

	}

	public void cancelLastHotel() {

		for (int i = btnCancel.size() - 1; i >= 0; i--) {
			if (!(elementGetText(btnCancel.get(i)).equals("Cancelled"))) {
				elementClickJS(btnCancel.get(i));
				break;
			}
		}
	}

	public void cancelExistingOrderId(String OrderId) {
		System.out.println(lstBookingId);
		System.out.println(btnCancel);
		for (int i = 0; i < lstBookingId.size(); i++) {
			if (elementGetText(lstBookingId.get(i)).equals(OrderId)) {
				if (elementGetText(btnCancel.get(i)).equals("Cancelled")) {
					System.out.println("Order already Cancelled");
				} else {
					scroll(lstBookingId.get(i));
					btnCancel.get(i).isSelected();
					highlight(btnCancel.get(i));
					elementClickJS(btnCancel.get(i));
					break;
				}
			}
		}

	}

}
