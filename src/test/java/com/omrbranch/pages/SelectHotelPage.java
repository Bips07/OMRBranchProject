package com.omrbranch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//*[@class='col-md-12']/div/h5")
	private WebElement textSelectHotel;
	By byTextSelectHotel = By.xpath("//*[@class='col-md-12']/div/h5");
	
	@FindBy(xpath ="//div[@class='col-md-5 hotel-suites']/h5")
	private WebElement lstHotelNames;
	
	@FindBy(xpath ="//*[@class='total-prize']")
	private WebElement lstHotelPrices;
	
	@FindBy(xpath = "//a[@class='btn filter_btn']")
	private WebElement lstBtnContinue;
	
	By byButton = By.xpath("//button[@class='btn filter_btn']");

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public WebElement getLstHotelNames() {
		return lstHotelNames;
	}

	public WebElement getLstHotelPrices() {
		return lstHotelPrices;
	}

	public WebElement getLstBtnContinue() {
		return lstBtnContinue;
	}
	
	public void shadowHost() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowHost = (WebElement) js.executeScript("return document.querySelector('custom-element')");
		
	}
	
	public String getSelectHotelString()  {
		
		shadowHost();
		String msg = elementGetText(textSelectHotel);
		return msg;
	}
	
	

}
