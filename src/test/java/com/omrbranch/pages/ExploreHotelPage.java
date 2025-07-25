package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class ExploreHotelPage extends BaseClass {

	public ExploreHotelPage() {
		PageFactory.initElements(driver, this);
	}

	List<String> acthotelNames = new ArrayList<String>();
	List<String> exphotelNames = new ArrayList<String>();
	List<Integer> acthotelPrices = new ArrayList<Integer>();
	List<Integer> exphotelPrices = new ArrayList<Integer>();

	@FindBy(xpath = "//*[@data-testid ='username']")
	private WebElement textWelcome;

	public WebElement getTextWelcome() {
		return textWelcome;
	}

	@FindBy(xpath = "//*[@data-href='https://omrbranch.com/hotel-booking']")
	private WebElement lnkHotel;

	@FindBy(xpath = "//*[@class='fliter_box_inner']/h5")
	private WebElement textExploreHotel;

	@FindBy(name = "state")
	private WebElement ddnState;
	By ddnStateBy = By.name("state");

	@FindBy(name = "city")
	private WebElement ddnCity;
	By ddnCityBy = By.xpath("//select[@name='city']/option[2]");

	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	@FindBy(name = "check_in")
	private WebElement txtCheckIn;

	@FindBy(xpath = "//a[contains(text(),'27')]")
	private WebElement lnkCheckInDate;

	@FindBy(name = "check_out")
	private WebElement txtCheckOut;

	@FindBy(xpath = "//a[@class ='ui-state-default'] [contains(text(),'29')]")
	private WebElement lnkCheckOutDate;

	@FindBy(name = "no_rooms")
	private WebElement ddnNoOfRooms;
	By byNoOfRoom = By.xpath("//select[@name='no_rooms']/option[2]");

	@FindBy(name = "no_adults")
	private WebElement ddnNoOfAdults;
	By byNoOfAdults = By.xpath("//select[@name='no_adults']/option[2]");

	@FindBy(name = "no_child")
	private WebElement ddnNoOfChild;

	@FindBy(id = "hotelsearch_iframe")
	private WebElement frameBtnSearch;

	@FindBy(xpath = "//*[@id='searchBtn']")
	private WebElement btnSearch;

	@FindBy(xpath = "//label[@for='value_ndesc']")
	private WebElement rdoDescending;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']/h5")
	private List<WebElement> textHotelNames;

	@FindBy(xpath = "//label[@for='Standard']")
	private WebElement chkStandard;

	@FindBy(id = "invalid-state")
	private WebElement txtErrorState;

	@FindBy(xpath = "//div[@id='invalid-city']")
	private WebElement txtErrorCity;

	@FindBy(xpath = "//div[@id='invalid-check_in']")
	private WebElement txtErrorCheckIn;

	@FindBy(xpath = "//div[@id='invalid-check_out']")
	private WebElement txtErrorCheckOut;

	@FindBy(xpath = "//div[@id='invalid-no_rooms']")
	private WebElement txtErrorNoOfRooms;

	@FindBy(xpath = "//div[@id='invalid-no_adults']")
	private WebElement txtErrorNoOfAdults;

	@FindBy(xpath = "//label[@for='value_pltoh']")
	private WebElement rdoPriceLowToHigh;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> textHotelPrices;
	By bytextHotelPrices = By.xpath("//strong[@class='total-prize'][1]");

	public WebElement getRdoPriceLowToHigh() {
		return rdoPriceLowToHigh;
	}

	public List<WebElement> getTextHotelPrices() {
		return textHotelPrices;
	}

	public List<String> getActhotelNames() {
		return acthotelNames;
	}

	public List<String> getExphotelNames() {
		return exphotelNames;
	}

	public WebElement getTxtErrorState() {
		return txtErrorState;
	}

	public WebElement getTxtErrorCity() {
		return txtErrorCity;
	}

	public WebElement getTxtErrorCheckIn() {
		return txtErrorCheckIn;
	}

	public WebElement getTxtErrorCheckOut() {
		return txtErrorCheckOut;
	}

	public WebElement getTxtErrorNoOfRooms() {
		return txtErrorNoOfRooms;
	}

	public WebElement getTxtErrorNoOfAdults() {
		return txtErrorNoOfAdults;
	}

	public WebElement getChkStandard() {
		return chkStandard;
	}

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

	public By getDdnStateBy() {
		return ddnStateBy;
	}

	public By getDdnCityBy() {
		return ddnCityBy;
	}

	public By getByNoOfRoom() {
		return byNoOfRoom;
	}

	public By getByNoOfAdults() {
		return byNoOfAdults;
	}

	public WebElement getRdoDescending() {
		return rdoDescending;
	}

	public List<WebElement> getTextHotelNames() {
		return textHotelNames;
	}

	public String getLoginSuccessMessage() {

		String text = elementGetText(textWelcome);
		return text;
	}

	public void clickLnkHotel() {
		elementClick(lnkHotel);
	}

	public void searchHotel(String state, String city, String roomType, String checkInDate, String checkOutDate,
			String noOfRooms, String noOfAdults, String noOfChildren) {

		clickLnkHotel();
		selectOptionByValue(ddnState, state);
		explicitWait(ddnCityBy);
		selectOptionByValue(ddnCity, city);
		if (roomType.contains("/")) {
			String[] roomTypes = roomType.split("/");
			for (String x : roomTypes) {
				selectOptionByValue(ddnRoomType, x);
			}
		} else {
			selectOptionByValue(ddnRoomType, roomType);
		}

		elementClick(txtCheckIn);
		elementClick(lnkCheckInDate);
		elementClick(txtCheckOut);
		elementClick(lnkCheckOutDate);
		selectOptionByValue(ddnNoOfRooms, noOfRooms);
		selectOptionByValue(ddnNoOfAdults, noOfAdults);
		elementSendKeys(ddnNoOfChild, noOfChildren);
		switchFrameByElement(frameBtnSearch);
		elementClick(btnSearch);

	}

	public void searchHotel(String state, String city, String checkInDate, String checkOutDate, String noOfRooms,
			String noOfAdults) {

		clickLnkHotel();
		selectOptionByValue(ddnState, state);
		explicitWait(ddnCityBy);
		selectOptionByValue(ddnCity, city);
		elementClick(txtCheckIn);
		elementClick(lnkCheckInDate);
		elementClick(txtCheckOut);
		elementClick(lnkCheckOutDate);
		selectOptionByValue(ddnNoOfRooms, noOfRooms);
		selectOptionByValue(ddnNoOfAdults, noOfAdults);
		switchFrameByElement(frameBtnSearch);
		elementClick(btnSearch);

	}

	public void clickSearchButton() {
		switchFrameByElement(frameBtnSearch);
		elementClick(btnSearch);

	}

	public void clickDescending() {
		elementClick(rdoDescending);
	}

	public boolean checkDescendingOrder() {

		int count = 0;
		timeOut(2000);
		for (WebElement element : textHotelNames) {
			acthotelNames.add(elementGetText(element));
			exphotelNames.add(elementGetText(element));

		}
		exphotelNames.sort(Collections.reverseOrder());

		for (int i = 0; i < exphotelNames.size(); i++) {
			if (acthotelNames.get(i).equals(exphotelNames.get(i))) {
				count++;
			}
		}
		if (count == exphotelNames.size()) {
			return true;
		}
		return false;
	}

	public boolean verifyHeader(String roomType) {
		int count = 0;
		String[] roomTypes = roomType.split("/");
		for (int i = 0; i < exphotelNames.size(); i++) {
			for (int j = 0; j < roomTypes.length; j++) {
				if (acthotelNames.get(i).contains(roomTypes[j])) {
					count++;
				}
			}
		}
		if (count == acthotelNames.size())
			return true;
		return false;
	}

	public void clickStandardType() {
		elementClick(chkStandard);
	}

	public boolean checkStandardRoomType() {
		timeOut(2000);
		for (WebElement element : textHotelNames) {
			acthotelNames.add(elementGetText(element));
		}
		for (int i = 0; i < acthotelNames.size(); i++) {
			if (acthotelNames.get(i).contains(chkStandard.getText())) {
				return true;
			}
		}
		return false;
	}

	public String getErrorMessage(WebElement element) {
		
		String message = elementGetText(element);
		return message;
	}

	public void clickRdoPriceLowToHigh() {

		elementClick(rdoPriceLowToHigh);

	}

	public boolean checkPriceLowToHigh() {
		int count = 0;
		timeOut(2000);
		for (WebElement element : textHotelPrices) {
			String text = elementGetText(element);
			String price = (text.replace("$", "")).replace(",", "").strip();
			acthotelPrices.add(Integer.parseInt(price));
			exphotelPrices.add(Integer.parseInt(price));
		}
		exphotelPrices.sort(null);
		for (int i = 0; i < exphotelPrices.size(); i++) {
			if (acthotelPrices.get(i).equals(exphotelPrices.get(i))) {
				count++;
			}
		}
		if (count == exphotelPrices.size()) {
			return true;
		}
		return false;
	}
}
