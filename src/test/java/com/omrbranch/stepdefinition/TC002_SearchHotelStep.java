package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC002_SearchHotelStep extends BaseClass {

//	PageObjectManager PageObjectManager.getInstance() = new PageObjectManager();

	static String roomType;
	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String state, String city, String roomType, String checkInDate,
			String checkOutDate, String noOfRooms, String noOfAdults, String noOfChildren) {
		TC002_SearchHotelStep.roomType = roomType;
		PageObjectManager.getInstance().getExploreHotelPage().searchHotel(state, city, roomType, checkInDate, checkOutDate, noOfRooms, noOfAdults,
				noOfChildren);
	}

	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String string) throws InterruptedException {
		timeOut(10);
		PageObjectManager.getInstance().getSelectHotelPage().getSelectHotelString();
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String state, String city, String checkInDate, String checkOutDate,
			String noOfRooms, String noOfAdults) {

		PageObjectManager.getInstance().getExploreHotelPage().searchHotel(state, city, checkInDate, checkOutDate, noOfRooms, noOfAdults);

	
	}

	@When("User click sort from low to high")
	public void user_click_sort_from_low_to_high() {
		
		PageObjectManager.getInstance().getExploreHotelPage().clickRdoPriceLowToHigh();
	}

	@Then("User should verify after sorting that price are listed from low to high")
	public void user_should_verify_after_sorting_that_price_are_listed_from_low_to_high() {
		
		boolean status = PageObjectManager.getInstance().getExploreHotelPage().checkPriceLowToHigh();
		Assert.assertTrue(status);
	}

	@When("User click sort from Descending order")
	public void user_click_sort_from_descending_order() {

		PageObjectManager.getInstance().getExploreHotelPage().clickDescending();

	}

	@Then("User should verify after sorting that name in Descending order")
	public void user_should_verify_after_sorting_that_name_in_descending_order() {

		boolean status = PageObjectManager.getInstance().getExploreHotelPage().checkDescendingOrder();
		Assert.assertTrue(status);

	}

	@Then("User should verify the header contains {string}")
	public void user_should_verify_the_header_contains(String roomType) {

		boolean status = PageObjectManager.getInstance().getExploreHotelPage().verifyHeader(roomType);
		Assert.assertTrue(status);
	}

	@When("User click Standard room type")
	public void user_click_standard_room_type() {

		PageObjectManager.getInstance().getExploreHotelPage().clickStandardType();
	}

	@Then("User should verify after sorting that Standard room type is listed")
	public void user_should_verify_after_sorting_that_standard_room_type_is_listed() {

		boolean status = PageObjectManager.getInstance().getExploreHotelPage().checkStandardRoomType();
		Assert.assertTrue(status);

	}

	@Then("User click Search button")
	public void user_click_search_button() {
		PageObjectManager.getInstance().getExploreHotelPage().clickLnkHotel();
		PageObjectManager.getInstance().getExploreHotelPage().clickSearchButton();
		switchToDefault();

	}

	@Then("User should verify after search hotel error message {string} ,{string} ,{string} ,{string} ,{string} and {string}")
	public void user_should_verify_after_search_hotel_error_message_and(String expErrorState, String expErrorCity,
			String expErrorCheckIn, String expErrorCheckOut, String expErrorNoOfRooms, String expErrorNoOfAdults) {

		String actErrorState = PageObjectManager.getInstance().getExploreHotelPage().getErrorMessage(PageObjectManager.getInstance().getExploreHotelPage().getTxtErrorState());
		String actErrorCity = PageObjectManager.getInstance().getExploreHotelPage().getErrorMessage(PageObjectManager.getInstance().getExploreHotelPage().getTxtErrorCity());
		String actErrorCheckIn = PageObjectManager.getInstance().getExploreHotelPage().getErrorMessage(PageObjectManager.getInstance().getExploreHotelPage().getTxtErrorCheckIn());
		String actErrorCheckOut = PageObjectManager.getInstance().getExploreHotelPage().getErrorMessage(PageObjectManager.getInstance().getExploreHotelPage().getTxtErrorCheckOut());
		String actErrorNoOfRooms = PageObjectManager.getInstance().getExploreHotelPage().getErrorMessage(PageObjectManager.getInstance().getExploreHotelPage().getTxtErrorNoOfRooms());
		String actErrorNoOfAdults = PageObjectManager.getInstance().getExploreHotelPage().getErrorMessage(PageObjectManager.getInstance().getExploreHotelPage().getTxtErrorNoOfAdults());
		Assert.assertEquals("Verify the Error message for State",expErrorState,actErrorState);
		Assert.assertEquals("Verify the Error message for City",expErrorCity,actErrorCity);
		Assert.assertEquals("Verify the Error message for CheckInDate",expErrorCheckIn,actErrorCheckIn);
		Assert.assertEquals("Verify the Error message for CheckOutDate",expErrorCheckOut,actErrorCheckOut);
		Assert.assertEquals("Verify the Error message for NoOfRooms",expErrorNoOfRooms,actErrorNoOfRooms);
		Assert.assertEquals("Verify the Error message for NoOfAdults",expErrorNoOfAdults,actErrorNoOfAdults);
		
	}

}
