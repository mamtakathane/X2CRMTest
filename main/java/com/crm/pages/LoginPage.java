package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory-OR:
	@FindBy(id = "LoginForm_username")
	WebElement username;

	@FindBy(id = "LoginForm_password")
	WebElement password;

	@FindBy(xpath = "//button[@id='signin-button']")
	WebElement loginBtn;

	@FindBy(xpath = "//*[@id='login-form-logo']")
	WebElement x2crmLogo;

	// initializing the page objects:
	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	// Actions
	public String ValidateloginPageTitle() {
		return driver.getTitle();

	}

	public boolean validateX2CRMImage() {

		return x2crmLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();

	}

}
