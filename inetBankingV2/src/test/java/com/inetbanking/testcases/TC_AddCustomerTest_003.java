package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws Exception {

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("UserName is provided");

		lp.setPassword(password);
		logger.info("Password is provided");

		lp.clickSubmit();
		logger.info("Submit Button Clicked");

		Thread.sleep(3000);

		AddCustomerPage addCust = new AddCustomerPage(driver);

		addCust.clickAddNewCustomer();
		logger.info("Add Cusromer Clicked");
		Thread.sleep(1000);

		addCust.custName("pooja");
		logger.info("Customer Name Entered");
		Thread.sleep(1000);

		addCust.custGender("female");
		logger.info("Customer Gender Entered");
		Thread.sleep(1000);

		addCust.custdob("16", "07", "2000");
		logger.info("Customer Dob Entered");
		Thread.sleep(2000);

		addCust.custaddress("India");
		logger.info("Customer Address Entered");
		Thread.sleep(1000);

		addCust.custpinno("450001");
		logger.info("Customer PIN no Entered");
		Thread.sleep(1000);

		addCust.custstate("Madhyapradesh");
		logger.info("Customer state Entered");
		Thread.sleep(1000);

		addCust.custtelephnno("1234567890");
		logger.info("Customer Phone no. Entered");
		Thread.sleep(1000);

		addCust.custcity("Khandwa");
		logger.info("Customer City Entered");
		Thread.sleep(1000);

		String email = randomString() + "@gmail.com";
		addCust.custemailid(email);
		logger.info("Customer Email Entered");

		addCust.custpassword("abcdef");
		logger.info("Customer passsword Entered");
		addCust.custsubmit();

		Thread.sleep(1000);

		logger.info("Validation Started.........");
		Boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if (res == true) {
			Assert.assertTrue(true);
			logger.info("TestCase PAssed....");
		} else {
			captureScreenshot(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.info("TestCase Failed....");
		}
	}

}
