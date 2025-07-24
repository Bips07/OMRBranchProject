package com.omrbranch.stepdefinition;
import io.cucumber.java.en.*;

public class TC002_SearchHotelStep {
	

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	}
	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String string) {
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String string, String string2, String string3, String string4, String string5, String string6) {
	}
	

	@When("User click sort from low to high")
	public void user_click_sort_from_low_to_high() {
	}
	@Then("User should verify after sorting that price are listed from low to high")
	public void user_should_verify_after_sorting_that_price_are_listed_from_low_to_high() {
	}

	@When("User click sort from Descending order")
	public void user_click_sort_from_descending_order() {
	}
	@Then("User should verify after sorting that name in Descending order")
	public void user_should_verify_after_sorting_that_name_in_descending_order() {
	}

	@Then("User should verify the header contains {string}")
	public void user_should_verify_the_header_contains(String string) {
	}

	@When("User click Standard room type")
	public void user_click_standard_room_type() {
	}
	@Then("User should verify after sorting that Standard room type is listed")
	public void user_should_verify_after_sorting_that_standard_room_type_is_listed() {
	}

	@Then("User click Search button")
	public void user_click_search_button() {
	}
	@Then("User should verify after search hotel error message {string} ,{string} ,{string} ,{string} ,{string} and {string}")
	public void user_should_verify_after_search_hotel_error_message_and(String string, String string2, String string3, String string4, String string5, String string6) {
	}




}
