package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(name = "pass")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//*[@value='login']")
	private WebElement btnLogin;
	
	@FindBy(id = "errorMessage")
	private WebElement textErrorMessage;

	public WebElement getTextErrorMessage() {
		return textErrorMessage;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String username, String password) {
		
		elementSendKeys(txtUserName, username);
		elementSendKeys(txtPassword, password);
		elementClick(btnLogin);
	}
	
	public void loginUsingEnterKey(String userName, String password) {
		elementSendKeys(txtUserName, userName);
		elementSendKeysEnter(txtPassword, password);
	}
	
	public String getErrorMessage() {
		String elementGetText = elementGetText(textErrorMessage);
		return elementGetText;
	}
	
}
