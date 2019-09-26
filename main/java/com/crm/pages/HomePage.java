package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@id='search-bar-title']")
	WebElement OpportunitiesLink;

	@FindBy(xpath = "//ul//li[6]//a[contains(text(),'Service')]")
	WebElement ServiceLink;

	@FindBy(xpath = "//span[contains(text(),'More')]")
	WebElement MoreLink;

	// initializing the page object

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String verifyHomePageTitle() {

		return driver.getTitle();

	}

	public OpportunitiesPage clickOnOpportunitiesLink() {
		OpportunitiesLink.click();
		return new OpportunitiesPage();

	}

	public ServicePage clickOnServiceLink() {

		ServiceLink.click();
		return new ServicePage();

	}

	public void MoreLink(String Actions) {
		Select se = new Select(driver.findElement(By.xpath("//span[contains(text(),'More')")));
		se.selectByVisibleText(Actions);

	}

}
