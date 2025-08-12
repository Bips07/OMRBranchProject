package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@class='px-3 py-2']")
	private WebElement textHotelName;
	
	@FindBy(id ="own")
	private WebElement rdoOwn;
	
	@FindBy(name ="title")
	private WebElement ddnSalutation;
	
	@FindBy(name ="first_name")
	private WebElement txtFirstName;

	@FindBy(name ="last_name")
	private WebElement txtLastName;
	
	@FindBy(name ="phone")
	private WebElement txtPhone;
	
	@FindBy(name ="email")
	private WebElement txtEmail;
	
	@FindBy(name ="gst")
	private WebElement chkGst;
	
	@FindBy(name ="registration")
	private WebElement txtRegistration;
	
	@FindBy(name ="company_name")
	private WebElement txtCompanyName;
	
	@FindBy(id ="step1next")
	private WebElement btnNext;
	
	@FindBy(id ="early")
	private WebElement chkEarly;
	
	@FindBy(name ="other_request")
	private WebElement txtOtherRequest;

	@FindBy(id ="step2next")
	private WebElement btnNext2;
	
	@FindBy(xpath = "//*[@class='credit-card pm']")
	private WebElement btnCreditCard;
	
	@FindBy(name ="payment_type")
	private WebElement ddnPaymentType;
	
	@FindBy(name ="card_type")
	private WebElement ddnCardType;
	
	@FindBy(name ="card_no")
	private WebElement txtCardNo;
	
	@FindBy(name ="card_name")
	private WebElement txtCardName;
	
	@FindBy(name ="card_month")
	private WebElement ddnCardMonth;
	
	@FindBy(name ="card_year")
	private WebElement ddnCardYear;
	
	@FindBy(name ="cvv")
	private WebElement txtCvv;
	
	@FindBy(id ="submitBtn")
	private WebElement btnSubmit;

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getRdoOwn() {
		return rdoOwn;
	}

	public WebElement getDdnSalutation() {
		return ddnSalutation;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getChkGst() {
		return chkGst;
	}

	public WebElement getTxtRegistration() {
		return txtRegistration;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getChkEarly() {
		return chkEarly;
	}

	public WebElement getTxtOtherRequest() {
		return txtOtherRequest;
	}

	public WebElement getBtnNext2() {
		return btnNext2;
	}

	public WebElement getBtnCreditCard() {
		return btnCreditCard;
	}

	public WebElement getDdnPaymentType() {
		return ddnPaymentType;
	}

	public WebElement getDdnCardType() {
		return ddnCardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getDdnCardMonth() {
		return ddnCardMonth;
	}

	public WebElement getDdnCardYear() {
		return ddnCardYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	public String getTextBookHotel() {
		String text = elementGetText(textHotelName);
		return text;
	}
}
