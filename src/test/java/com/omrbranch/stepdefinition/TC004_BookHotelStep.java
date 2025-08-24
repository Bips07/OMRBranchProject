package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC004_BookHotelStep extends BaseClass{

	PageObjectManager pom = new PageObjectManager();
	public static String bookingId;
	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void user_add_guest_details_and(String salutation, String firstName, String lastName, String mobileNumber,
			String email) {
		pom.getBookHotelPage().enterGuestDetails(salutation, firstName, lastName, mobileNumber, email);
		
	}

	@When("User add GST Details {string},{string} and {string}")
	public void user_add_gst_details_and(String regNo, String companyName, String companyAddress) {
		
		pom.getBookHotelPage().enterGstDetails(regNo, companyName, companyAddress);
	}

	@When("User add Special Request {string}")
	public void user_add_special_request(String request) {
		
		pom.getBookHotelPage().enterRequest(request);
		pom.getBookHotelPage().clickbtnNext2();
	}

	@When("User enter payment details, procced with Card Type {string}")
	public void user_enter_payment_details_procced_with_card_type(String cardType,io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMap = dataTable.asMaps();
		Map<String,String> cardDetails = asMap.get(0);
		pom.getBookHotelPage().addPayment(cardType, cardDetails.get("Select Card"), cardDetails.get("Card No"), 		cardDetails.get("Card Name"), cardDetails.get("Month"), cardDetails.get("Year"), cardDetails.get("CVV"));
	}

	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void user_should_verify_after_hotel_booking_success_message_and_save_the_order_id(String expMessage) {
		
		bookingId = pom.getBookingConfirmationPage().getBookingId();
		String actMessage = pom.getBookingConfirmationPage().getBookingConfirmedText();
		Assert.assertTrue("Booking confirmed text is not present",actMessage.contains(expMessage));
		
	}

	@Then("User should verify same selected Hotel is booked or not")
	public void user_should_verify_same_selected_hotel_is_booked_or_not() {
		String bookedHotelName = pom.getBookingConfirmationPage().getBookedHotelName();
		Assert.assertEquals("Booked hotels are not same", TC003_SelectHotelStep.firstHotelName,bookedHotelName);
		
	}

	@When("User clicks on Next button without entering special request")
	public void user_clicks_on_next_button_without_entering_special_request() {
		pom.getBookHotelPage().clickbtnNext2();
	}

	@When("User clicks on Next button without opting for GST")
	public void user_clicks_on_next_button_without_opting_for_gst() {
		pom.getBookHotelPage().clickBtnNext1();
	}

	@When("User click credit card")
	public void user_click_credit_card() {
		
		pom.getBookHotelPage().clickCreditCard();
	}

	@When("User click submit without entering payment details")
	public void user_click_submit_without_entering_payment_details() {
		
		pom.getBookHotelPage().clickBtnSubmit();
	}

	@Then("User should verify after payment details error message {string} ,{string} ,{string} ,{string} ,{string} and {string}")
	public void user_should_verify_after_payment_details_error_message_and(String expErrorMessageForCardType, String expErrorMessageCard, String expErrorMessageCardNumber, String expErrorMessageCardName, String expErrorMessageCardExpiry, String expErrorMessageCardCvv) {
		
		String actErrorMessageForCardType = pom.getBookHotelPage().getErrorInvalidPaymentType();
		String actErrorMessageCard = pom.getBookHotelPage().getErrorInvalidCardType();
		String actErrorMessageCardNumber = pom.getBookHotelPage().getErrorInvalidCardNo();
		String actErrorMessageCardName = pom.getBookHotelPage().getErrorInvalidCardName();
		String actErrorMessageCardExpiry = pom.getBookHotelPage().getErrorInvalidCardExpiry();
		String actErrorMessageCardCvv = pom.getBookHotelPage().getErrorInvalidCardCvv();
		
		Assert.assertEquals("Payment type Error message invalid ", expErrorMessageForCardType,actErrorMessageForCardType);
		Assert.assertEquals("Card type Error message invalid ", expErrorMessageCard,actErrorMessageCard);
		Assert.assertEquals("Card Number Error message invalid ", expErrorMessageCardNumber,actErrorMessageCardNumber);
		Assert.assertEquals("Card Name Error message invalid ", expErrorMessageCardName,actErrorMessageCardName);
		Assert.assertEquals("Card Expiry Error message invalid ", expErrorMessageCardExpiry,actErrorMessageCardExpiry);
		Assert.assertEquals("Card Cvv Error message invalid ", expErrorMessageCardCvv,actErrorMessageCardCvv);
	}

	@When("User enter upi details {string} and click submit")
	public void user_enter_upi_details_and_click_submit(String upiId) {
		pom.getBookHotelPage().clickBtnUpi();
		pom.getBookHotelPage().enterUpiDetails(upiId);
	}

	@When("User click upi")
	public void user_click_upi() {
		pom.getBookHotelPage().clickBtnUpi();
	}

	@Then("User should verify after payment details error message {string}")
	public void user_should_verify_after_payment_details_error_message(String expErrorMessageUpi) {
		
		String actErrorMessageUpi = pom.getBookHotelPage().getErrorInvalidUpi();
		Assert.assertEquals("UPI invalid error Message", expErrorMessageUpi,actErrorMessageUpi);
		
	}

}
