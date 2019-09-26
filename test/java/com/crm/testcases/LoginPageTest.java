package com.crm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() throws Exception {

		initiatization();
		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginPageLoginTitleTest() {
		String title = loginPage.ValidateloginPageTitle();
		Assert.assertEquals(title, "X2CRM - Login");

	}

	@Test(priority = 2)
	public void x2crmlogoImageTest() {
		boolean flag = loginPage.validateX2CRMImage();

	}

	@Test(priority = 3)
	public void LoginTest() throws Exception {
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
