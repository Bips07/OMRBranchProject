package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='searchform']/preceding-sibling::h5")
	private WebElement textSelectHotel;
	By byTextSelectHotel = By.xpath("//*[@id='searchform']/preceding-sibling::h5");

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']/h5")
	private List<WebElement> lstHotelNames;

	@FindBy(xpath = "//*[@class='total-prize']")
	private List<WebElement> lstHotelPrices;

	@FindBy(xpath = "//a[@class='btn filter_btn']")
	private List<WebElement> btnContinue;

	By byButton = By.xpath("//button[@class='btn filter_btn']");

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public List<WebElement> getLstHotelNames() {
		return lstHotelNames;
	}

	public List<WebElement> getLstHotelPrices() {
		return lstHotelPrices;
	}

	public List<WebElement> getBtnContinue() {
		return btnContinue;
	}

	public void shadowHost() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowHost = (WebElement) js.executeScript("return document.querySelector('custom-element')");

	}

	public String getSelectHotelString() {

		shadowHost();
		explicitWait(byTextSelectHotel);
		timeOut(5);
		String msg = elementGetText(textSelectHotel);
		return msg;
	}

	public String getSecondHotelName() {

		String secondHotelName = elementGetText(lstHotelNames.get(1));
		return secondHotelName;
	}

	public String getSecondHotelPrice() {

		String secondHotelPrice = elementGetText(lstHotelPrices.get(1));
		return secondHotelPrice;
	}
	
	public String getLastHotelName() {

		int index = lstHotelNames.size()-1;
		String lastHotelName = elementGetText(lstHotelNames.get(index));
		return lastHotelName;
	}
	public String getLastHotelPrice() {

		int index = lstHotelNames.size()-1;
		String lastHotelPrice = elementGetText(lstHotelPrices.get(index));
		return lastHotelPrice;
	}

	public void selectSecondHotel() {

		elementClick(btnContinue.get(1));
	}
	
	public void selectLastHotel() {
		int index = lstHotelNames.size()-1;
		scroll(lstHotelNames.get(index));
		elementClick(btnContinue.get(index));
	}
	
	public String getFirstHotelName() {

		String firstHotelName = elementGetText(lstHotelNames.get(0));
		return firstHotelName;
	}

	public String getFirstHotelPrice() {

		String firstHotelPrice = elementGetText(lstHotelPrices.get(0));
		return firstHotelPrice;
	}
	public void selectFirstHotel() {
		elementClick(btnContinue.get(0));
	}
	

}
