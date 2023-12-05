package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement linkAddNewCustomer;

	@FindBy(how = How.XPATH, using = "//input[@name='name']")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.XPATH, using = "//tbody/tr[5]/td[2]")
	@CacheLookup
	WebElement rdGender;

	@FindBy(how = How.XPATH, using = "//input[@id='dob']")
	@CacheLookup
	WebElement txtDOB;

	@FindBy(how = How.XPATH, using = "//textarea[@name='addr']")
	@CacheLookup
	WebElement txtAddress;

	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	@CacheLookup
	WebElement txtcity;

	@FindBy(how = How.XPATH, using = "//input[@name='state']")
	@CacheLookup
	WebElement txtstate;

	@FindBy(how = How.XPATH, using = "//input[@name='pinno']")
	@CacheLookup
	WebElement txtpin;

	@FindBy(how = How.XPATH, using = "//input[@name='telephoneno']")
	@CacheLookup
	WebElement txtTelephoneNo;

	@FindBy(how = How.XPATH, using = "//input[@name='emailid']")
	@CacheLookup
	WebElement txtemail;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(how = How.XPATH, using = "//input[@name='sub']")
	@CacheLookup
	WebElement btnSubmit;

	public void clickAddNewCustomer() {
		linkAddNewCustomer.click();
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}

	public void custGender(String cgender) {
		rdGender.click();
	}

	public void custdob(String mm, String dd, String yy) {
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yy);
	}

	public void custaddress(String caddress) {
		txtAddress.sendKeys(caddress);
	}

	public void custstate(String csate) {
		txtstate.sendKeys(csate);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custpinno(String cpinno) {
		txtpin.sendKeys(cpinno);
	}

	public void custtelephnno(String ctelephn) {
		txtTelephoneNo.sendKeys(ctelephn);
	}

	public void custemailid(String cemailid) {
		txtemail.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}

}
