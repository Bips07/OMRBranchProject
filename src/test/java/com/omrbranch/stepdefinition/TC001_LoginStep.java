package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pages.ExploreHotelPage;
import com.omrbranch.pages.LoginPage;

import io.cucumber.java.en.*;

public class TC001_LoginStep extends BaseClass{

	LoginPage l ;
	ExploreHotelPage e ;
	@Given("User is on the OMR Branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() {
		browserLaunch();
		driver.get("https://omrbranch.com");
		System.out.println("tesing");
	}

	@When("User login {string} and {string}")
	public void user_login_and(String string, String string2) {
		l=new LoginPage();
		l.login(string, string2);
	}

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String string) {
		e=new ExploreHotelPage();
		String msg = e.getLoginSuccessMessage();
		Assert.assertEquals("Verify the welcome message", string, msg);
	}

	@When("User login {string} and {string} with enter key")
	public void user_login_and_with_enter_key(String string, String string2) {
		l.loginUsingEnterKey(string, string2);
	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String string) {
		String msg = l.getErrorMessage();
		Assert.assertEquals("Verify the welcome message", "User does not exist", msg);
	}

}
