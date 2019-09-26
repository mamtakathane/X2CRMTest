package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.base.TestBase;

public class OpportunitiesPage extends TestBase {
	
	@FindBy(xpath = "//span[contains(text(),'Opportunities List')]")
	WebElement OpportunitiesList;
	
	
	@FindBy(xpath = "//span[contains(text(),'Create Opportunity')]")
	WebElement CreateOpportunities;
	
	@FindBy(xpath = "//ul/li[3]/a[contains(text(),'Import Opportunities')]]")
	WebElement ImportOpportunities;
	
	@FindBy(xpath = "//ul/li[4]/a[contains(text(),'Export Opportunities')]")
	WebElement ExportOpportunities;
	
	@FindBy(xpath = "//a[@id='x2-create-multiple-records-button']")
	WebElement QuickCreate;
}