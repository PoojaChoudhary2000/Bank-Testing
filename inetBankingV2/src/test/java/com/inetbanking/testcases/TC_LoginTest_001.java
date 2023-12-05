package com.inetbanking.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws Exception {

		driver.get(baseUrl);
		logger.info("url opened");

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Entered Username");

		lp.setPassword(password);
		logger.info("Entered Password");

		String Title = driver.getTitle();
		logger.info(Title);

		if (driver.getTitle().equals("Guru99 Bank Home Page")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		} else {
			captureScreenshot(driver, username);
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}

		lp.clickSubmit();
		logger.info("Submit button Clicked");
	}

}
