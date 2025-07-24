package com.omrbranch.stepdefinition;

import io.cucumber.java.en.*;

public class TC004_BookHotelStep {

	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void user_add_guest_details_and(String string, String string2, String string3, String string4,
			String string5) {
	}

	@When("User add GST Details {string},{string} and {string}")
	public void user_add_gst_details_and(String string, String string2, String string3) {
	}

	@When("User add Special Request {string}")
	public void user_add_special_request(String string) {
	}

	@When("User enter payment details, procced with Card Type {string}")
	public void user_enter_payment_details_procced_with_card_type(String string,
			io.cucumber.datatable.DataTable dataTable) {
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
	}

	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void user_should_verify_after_hotel_booking_success_message_and_save_the_order_id(String string) {
	}

	@Then("User should verify same selected Hotel is booked or not")
	public void user_should_verify_same_selected_hotel_is_booked_or_not() {
	}

	@When("User click credit card")
	public void user_click_credit_card() {
	}

	@When("User click submit without entering payment details")
	public void user_click_submit_without_entering_payment_details() {
	}

	@Then("User should verify after payment details error message {string} ,{string} ,{string} ,{string} ,{string} and {string}")
	public void user_should_verify_after_payment_details_error_message_and(String string, String string2,
			String string3, String string4, String string5, String string6) {
	}

	@When("User enter upi details {string} and click submit")
	public void user_enter_upi_details_and_click_submit(String string) {
	}

	@When("User click upi")
	public void user_click_upi() {
	}

	@Then("User should verify after payment details error message {string}")
	public void user_should_verify_after_payment_details_error_message(String string) {
	}

}
