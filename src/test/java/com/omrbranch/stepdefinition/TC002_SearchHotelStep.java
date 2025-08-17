package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC002_SearchHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	static String roomType;
	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String state, String city, String roomType, String checkInDate,
			String checkOutDate, String noOfRooms, String noOfAdults, String noOfChildren) {
		TC002_SearchHotelStep.roomType = roomType;
		pom.getExploreHotelPage().searchHotel(state, city, roomType, checkInDate, checkOutDate, noOfRooms, noOfAdults,
				noOfChildren);
	}

	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String string) throws InterruptedException {
		timeOut(10);
		pom.getSelectHotelPage().getSelectHotelString();
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String state, String city, String checkInDate, String checkOutDate,
			String noOfRooms, String noOfAdults) {

		pom.getExploreHotelPage().searchHotel(state, city, checkInDate, checkOutDate, noOfRooms, noOfAdults);

	
	}

	@When("User click sort from low to high")
	public void user_click_sort_from_low_to_high() {
		
		pom.getExploreHotelPage().clickRdoPriceLowToHigh();
	}

	@Then("User should verify after sorting that price are listed from low to high")
	public void user_should_verify_after_sorting_that_price_are_listed_from_low_to_high() {
		
		boolean status = pom.getExploreHotelPage().checkPriceLowToHigh();
		Assert.assertTrue(status);
	}

	@When("User click sort from Descending order")
	public void user_click_sort_from_descending_order() {

		pom.getExploreHotelPage().clickDescending();

	}

	@Then("User should verify after sorting that name in Descending order")
	public void user_should_verify_after_sorting_that_name_in_descending_order() {

		boolean status = pom.getExploreHotelPage().checkDescendingOrder();
		Assert.assertTrue(status);

	}

	@Then("User should verify the header contains {string}")
	public void user_should_verify_the_header_contains(String roomType) {

		boolean status = pom.getExploreHotelPage().verifyHeader(roomType);
		Assert.assertTrue(status);
	}

	@When("User click Standard room type")
	public void user_click_standard_room_type() {

		pom.getExploreHotelPage().clickStandardType();
	}

	@Then("User should verify after sorting that Standard room type is listed")
	public void user_should_verify_after_sorting_that_standard_room_type_is_listed() {

		boolean status = pom.getExploreHotelPage().checkStandardRoomType();
		Assert.assertTrue(status);

	}

	@Then("User click Search button")
	public void user_click_search_button() {
		pom.getExploreHotelPage().clickLnkHotel();
		pom.getExploreHotelPage().clickSearchButton();
		switchToDefault();

	}

	@Then("User should verify after search hotel error message {string} ,{string} ,{string} ,{string} ,{string} and {string}")
	public void user_should_verify_after_search_hotel_error_message_and(String expErrorState, String expErrorCity,
			String expErrorCheckIn, String expErrorCheckOut, String expErrorNoOfRooms, String expErrorNoOfAdults) {

		String actErrorState = pom.getExploreHotelPage().getErrorMessage(pom.getExploreHotelPage().getTxtErrorState());
		String actErrorCity = pom.getExploreHotelPage().getErrorMessage(pom.getExploreHotelPage().getTxtErrorCity());
		String actErrorCheckIn = pom.getExploreHotelPage().getErrorMessage(pom.getExploreHotelPage().getTxtErrorCheckIn());
		String actErrorCheckOut = pom.getExploreHotelPage().getErrorMessage(pom.getExploreHotelPage().getTxtErrorCheckOut());
		String actErrorNoOfRooms = pom.getExploreHotelPage().getErrorMessage(pom.getExploreHotelPage().getTxtErrorNoOfRooms());
		String actErrorNoOfAdults = pom.getExploreHotelPage().getErrorMessage(pom.getExploreHotelPage().getTxtErrorNoOfAdults());
		Assert.assertEquals("Verify the Error message for State",expErrorState,actErrorState);
		Assert.assertEquals("Verify the Error message for City",expErrorCity,actErrorCity);
		Assert.assertEquals("Verify the Error message for CheckInDate",expErrorCheckIn,actErrorCheckIn);
		Assert.assertEquals("Verify the Error message for CheckOutDate",expErrorCheckOut,actErrorCheckOut);
		Assert.assertEquals("Verify the Error message for NoOfRooms",expErrorNoOfRooms,actErrorNoOfRooms);
		Assert.assertEquals("Verify the Error message for NoOfAdults",expErrorNoOfAdults,actErrorNoOfAdults);
		
	}

}
