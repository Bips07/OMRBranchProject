package com.omrbranch.pages;

import org.openqa.selenium.By;
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
	By sddnSalutation = By.name("title");
	
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
	By byddnPaymentType = By.name("payment_type");
	
	@FindBy(name ="card_type")
	private WebElement ddnCardType;
	By byddnCardType = By.name("card_type");
	
	@FindBy(name ="card_no")
	private WebElement txtCardNo;
	
	@FindBy(name ="card_name")
	private WebElement txtCardName;
	
	@FindBy(name ="card_month")
	private WebElement ddnCardMonth;
	By byddnCardMonth = By.name("card_month");
	
	@FindBy(name ="card_year")
	private WebElement ddnCardYear;
	By byddnCardYear = By.name("card_year");
	
	@FindBy(name ="cvv")
	private WebElement txtCvv;
	
	@FindBy(id ="submitBtn")
	private WebElement btnSubmit;
	
	@FindBy(id = "company_address")
	private WebElement txtCompanyAddress;

	
	@FindBy(id = "invalid-payment_type")
	private WebElement textInvalidPaymentType;
	
	@FindBy(id="invalid-card_type")
	private WebElement textInvalidCardType;
	
	@FindBy(id = "invalid-card_no")
	private WebElement textInvalidCardNo;
	
	@FindBy(id = "invalid-card_name")
	private WebElement textInvalidCardName;
	
	@FindBy (id = "invalid-card_month")
	private WebElement textInvalidCardMonth;
	
	@FindBy(id = "invalid-cvv")
	private WebElement textInvalidCardCvv;
	
	@FindBy(xpath = "//h5[text()='UPI']")
	private WebElement btnUPI;
	
	@FindBy(id = "upi_id")
	private WebElement txtUpiId;
	
	@FindBy(id ="invalid-upi")
	private WebElement textInvalidUpi;
	
	public By getSddnSalutation() {
		return sddnSalutation;
	}

	public WebElement getBtnUPI() {
		return btnUPI;
	}

	public WebElement getTxtUpiId() {
		return txtUpiId;
	}

	public WebElement getTextInvalidUpi() {
		return textInvalidUpi;
	}

	public By getByddnPaymentType() {
		return byddnPaymentType;
	}

	public By getByddnCardType() {
		return byddnCardType;
	}

	public By getByddnCardMonth() {
		return byddnCardMonth;
	}

	public By getByddnCardYear() {
		return byddnCardYear;
	}

	public WebElement getTextInvalidPaymentType() {
		return textInvalidPaymentType;
	}

	public WebElement getTextInvalidCardType() {
		return textInvalidCardType;
	}

	public WebElement getTextInvalidCardNo() {
		return textInvalidCardNo;
	}

	public WebElement getTextInvalidCardName() {
		return textInvalidCardName;
	}

	public WebElement getTextInvalidCardMonth() {
		return textInvalidCardMonth;
	}

	public WebElement getTextInvalidCardCvv() {
		return textInvalidCardCvv;
	}

	
	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
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
	
	public void enterGuestDetails(String salutation, String firstName, String lastName, String mobileNumber, String email) {
		scroll(txtFirstName);
		elementClick(rdoOwn);
		explicitWait(sddnSalutation);
		selectOptionByText(ddnSalutation, salutation);
		elementSendKeys(txtFirstName, firstName);
		elementSendKeys(txtLastName, lastName);
		elementSendKeys(txtPhone, mobileNumber);
		elementSendKeys(txtEmail, email);
	}
	public void enterGstDetails(String regNo, String companyName, String companyAddress) {
		elementClick(chkGst);
		elementSendKeys(txtRegistration, regNo);
		elementSendKeys(txtCompanyName, companyName);
		elementSendKeys(txtCompanyAddress, companyAddress);
		clickBtnNext1();
	}
	
	public void clickBtnNext1() {
		elementClick(btnNext);
	}
	
	public void enterRequest(String request) {
		elementSendKeys(txtOtherRequest, request);
	}
	
	public void clickbtnNext2() {
		elementClick(btnNext2);
	}
	
	public void addPayment(String cardType, String card, String cardNumber, String name, String month, String year, String cvv) {
		clickCreditCard();
		explicitWait(byddnPaymentType);
		selectOptionByText(ddnPaymentType, cardType );
		explicitWait(byddnCardType);
		selectOptionByText(ddnCardType, card );
		elementSendKeys(txtCardNo, cardNumber);
		elementSendKeys(txtCardName, name);
		explicitWait(byddnCardMonth);
		selectOptionByText(ddnCardMonth,month);
		explicitWait(byddnCardYear);
		selectOptionByText(ddnCardYear,year);
		elementSendKeys(txtCvv,cvv);
		clickBtnSubmit();
	}
	
	public void clickCreditCard() {
		elementClick(btnCreditCard);
	}
	
	public void clickBtnSubmit() {
		elementClick(btnSubmit);
	}
	
	public String getErrorInvalidPaymentType() {
		String text = elementGetText(textInvalidPaymentType);
		return text;
	}
	
	public String getErrorInvalidCardType() {
		String text = elementGetText(textInvalidCardType);
		return text;
	}
	
	public String getErrorInvalidCardNo() {
		String text = elementGetText(textInvalidCardNo);
		return text;
	}
	
	public String getErrorInvalidCardName() {
		String text = elementGetText(textInvalidCardName);
		return text;
	}
	
	public String getErrorInvalidCardExpiry() {
		String text = elementGetText(textInvalidCardMonth);
		return text;
	}
	
	public String getErrorInvalidCardCvv() {
		String text = elementGetText(textInvalidCardCvv);
		return text;
	}
	
	public void clickBtnUpi() {
		elementClick(btnUPI);
	}
	
	public String getErrorInvalidUpi() {
		String text = elementGetText(textInvalidUpi);
		return text;
	}
}
