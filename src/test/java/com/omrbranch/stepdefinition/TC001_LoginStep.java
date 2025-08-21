package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC001_LoginStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("User is on the OMR Branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() throws FileNotFoundException, IOException {
		browserLaunch();
		enterApplnUrl(getPropertiesFileValue("url"));
		implicitWait();
	}

	@When("User login {string} and {string}")
	public void user_login_and(String userName, String password) {
		
		pom.getLoginPage().login(userName, password);
	}

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String expMessage) {
		
		String actmsg = pom.getExploreHotelPage().getLoginSuccessMessage();
		Assert.assertEquals("Verify the welcome message", expMessage, actmsg);
	}

	@When("User login {string} and {string} with enter key")
	public void user_login_and_with_enter_key(String userName, String password) {
		pom.getLoginPage().loginUsingEnterKey(userName, password);
	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String expMessage) {
		String msg = pom.getLoginPage().getErrorMessage();
		Assert.assertEquals("Verify the welcome message", "User does not exist", msg);
	}

}
