package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@name='uid']")
	WebElement txtUsername;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtpassword;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	WebElement logoutButton;
	

	public void setUserName(String uname) {
		txtUsername.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		loginButton.click();

	}
	public void clickLogout() {
		logoutButton.click();
		
	}
}
