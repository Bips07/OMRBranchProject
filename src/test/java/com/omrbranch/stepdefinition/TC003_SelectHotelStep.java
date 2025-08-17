package com.omrbranch.stepdefinition;
import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC003_SelectHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	public static String secondHotelName;
	public static String secondHotelPrice;
	
	public static String lastHotelName;
	public static String lastHotelPrice;
	
	public static String firstHotelName;
	public static String firstHotelPrice;
	
	@When("User save the Second hotel name and hotel price")
	public void user_save_the_second_hotel_name_and_hotel_price() {
		
		secondHotelName =pom.getSelectHotelPage().getSecondHotelName();
		secondHotelPrice = pom.getSelectHotelPage().getSecondHotelPrice();
	}
	@When("User select the Select hotel and accept the alert")
	public void user_select_the_select_hotel_and_accept_the_alert() {
		
		pom.getSelectHotelPage().selectSecondHotel();
		acceptAlert();
		
	}
	@Then("User should verify after select success message {string}")
	public void user_should_verify_after_select_success_message(String expMessage) {
		
		//timeOut(5);
		String actMessage = pom.getBookHotelPage().getTextBookHotel();
		Assert.assertTrue("Does not contain book hotel string", actMessage.contains(expMessage));
	}

	@When("User save the last hotel name and hotel price")
	public void user_save_the_last_hotel_name_and_hotel_price() {
		lastHotelName = pom.getSelectHotelPage().getLastHotelName();
		lastHotelPrice = pom.getSelectHotelPage().getLastHotelPrice();
		System.out.println(lastHotelName);
	}
	@When("User select the last hotel and accept the alert")
	public void user_select_the_last_hotel_and_accept_the_alert() {
		pom.getSelectHotelPage().selectLastHotel();
		acceptAlert();
	}
	
	@When("User save the first hotel name and hotel price")
	public void user_save_the_first_hotel_name_and_hotel_price() {
		
		firstHotelName = pom.getSelectHotelPage().getFirstHotelName().replace(TC002_SearchHotelStep.roomType, "").trim();
		firstHotelPrice = pom.getSelectHotelPage().getFirstHotelPrice();
	}
	@When("User select the first hotel and accept the alert")
	public void user_select_the_first_hotel_and_accept_the_alert() {
		pom.getSelectHotelPage().selectFirstHotel();
		acceptAlert();
	}
}
