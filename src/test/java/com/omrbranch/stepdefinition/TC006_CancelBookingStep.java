package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC006_CancelBookingStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	@When("User should Cancel the new order ID")
	public void user_should_cancel_the_new_order_id() {
		pom.getMyBookingPage().clickCancel();
	}

	@Then("User should verify after cancel booking success message {string}")
	public void user_should_verify_after_cancel_booking_success_message(String expMessage) {
		acceptAlert();
		String actMessage = pom.getMyBookingPage().getMessage();
		Assert.assertEquals("Cancel message is incorrect", expMessage,actMessage);
		
	}

	@When("User should Cancel the existing order ID {string}")
	public void user_should_cancel_the_existing_order_id(String orderId) {
		pom.getMyBookingPage().cancelExistingOrderId(orderId);
	}

	@When("User should Cancel the first order ID")
	public void user_should_cancel_the_first_order_id() {
		pom.getMyBookingPage().cancelFirstHotel();
	}

	@When("User should Cancel the last order ID")
	public void user_should_cancel_the_last_order_id() {
		pom.getMyBookingPage().cancelLastHotel();
	}

}
