package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC005_ChangeBookingStep extends BaseClass{

	PageObjectManager pom = new PageObjectManager();
	String bookingID ="";
	@When("User navigate to My Booking page")
	public void user_navigate_to_my_booking_page() {
		
		pom.getBookingConfirmationPage().clickBtnMyBooking();
	}

	@Then("User should verify after navigate to My Booking page success message as {string}")
	public void user_should_verify_after_navigate_to_my_booking_page_success_message_as(String expMessage) {
		
		String actMessage = pom.getMyBookingPage().getBookingText();
		Assert.assertEquals("Booking text", expMessage,actMessage);
	}

	@When("User search the Order ID")
	public void user_search_the_order_id() {
		pom.getMyBookingPage().searchBookingId();
	}

	@Then("User should verify same booked Order ID is present or not")
	public void user_should_verify_same_booked_order_id_is_present_or_not() {
		waitTime(5);
		String actbookingId = pom.getMyBookingPage().getBookingId();
		Assert.assertEquals("Booking is not same", TC004_BookHotelStep.bookingId,actbookingId);
	}

	@Then("User should verify same booked Hotel Name is present or not")
	public void user_should_verify_same_booked_hotel_name_is_present_or_not() {
		waitTime(2);
		String actHotelName = pom.getMyBookingPage().getHotelName();
		Assert.assertTrue("Hotel Name is not same", actHotelName.contains(TC003_SelectHotelStep.firstHotelName));
	}

	@Then("User should verify same booked Hotel Price is present or not")
	public void user_should_verify_same_booked_hotel_price_is_present_or_not() {
		waitTime(2);
		String actHotelPrice = pom.getMyBookingPage().getHotelPrice();
		Assert.assertEquals("Hotel Price is not same", TC003_SelectHotelStep.firstHotelPrice,actHotelPrice);
	}

	@When("User edit the Check-in Date {string}")
	public void user_edit_the_check_in_date(String newDate) {
		
		pom.getMyBookingPage().clickBtnEdit();
		pom.getMyBookingPage().changeBookingDate(newDate);
	}

	@Then("User should verify after modify check-in date success message {string}")
	public void user_should_verify_after_modify_check_in_date_success_message(String expMessage) {
		String actMessage = pom.getMyBookingPage().getMessage();
		Assert.assertEquals("Success Message is incorrect", expMessage, actMessage);
	}

	@When("User navigate to My Booking page from Home page")
	public void user_navigate_to_my_booking_page_from_home_page() {
		pom.getExploreHotelPage().clickMyAccount();
	}

	@When("User search the Order ID {string}")
	public void user_search_the_order_id(String bookingId) {
		this.bookingID = bookingId.replace("#", "");
		pom.getMyBookingPage().searchBookingId(bookingId);
	}
	
	@Then("User should verify Order ID is present or not")
	public void user_should_verify_order_id_is_present_or_not() {
		waitTime(5);
		String actBooking = pom.getMyBookingPage().getBookingId();
		Assert.assertTrue("Booking id is not present",actBooking.contains(bookingID));
	}

	@When("User edit the Check-in Date for the first displayed Order ID {string}")
	public void user_edit_the_check_in_date_for_the_first_displayed_order_id(String newDate) {
		pom.getMyBookingPage().selectFirstHotel();
		pom.getMyBookingPage().changeBookingDate(newDate);
		
	}

	@When("User edit the Check-in Date for the last displayed Order ID {string}")
	public void user_edit_the_check_in_date_for_the_last_displayed_order_id(String newDate) {
		pom.getMyBookingPage().selectLastHotel();
		pom.getMyBookingPage().changeBookingDate(newDate);		
	}

}
