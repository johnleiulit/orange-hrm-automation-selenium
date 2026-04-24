package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class MembershipsPage extends Library {
	SeleniumReusable se;

	public MembershipsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath = "//a[text()='Memberships']")
	WebElement memberships;
	
	@FindBy(xpath = "//h6[text()='Assigned Memberships']")
	WebElement membershipsPage;
	
	@FindBy(xpath = "//h6[text()='Assigned Memberships']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Membership']/following::div[@class='oxd-select-text-input'][1]")
	WebElement membershipInput;
	
	@FindBy(xpath = "//label[text()='Subscription Paid By']/following::div[@class='oxd-select-text-input'][1]")
	WebElement subscriptionPaidByInput;
	
	@FindBy(xpath = "//label[text()='Subscription Amount']/following::input[1]")
	WebElement subscriptionAmountInput;
	
	@FindBy(xpath = "//label[text()='Currency']/following::div[@class='oxd-select-text-input'][1]")
	WebElement currencyInput;
	
	@FindBy(xpath = "//label[text()='Subscription Commence Date']/following::input[1]")
	WebElement subscriptionCommenceDateInput;
	
	@FindBy(xpath = "//label[text()='Subscription Renewal Date']/following::input[1]")
	WebElement subscriptionRenewalDateInput;
	
	@FindBy(xpath = "//button[text()=' Save '][1]")
	WebElement saveButton;
	
	
	
	public void memberships () {
		se.scrollUp(memberships);
		se.click(memberships);
	}
	
	public void membershipsPage () {
		System.out.println("WELCOME" + membershipsPage.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void membershipInput (String value) {
		se.selectDropdown(membershipInput, value);
	}
	
	public void subscriptionPaidByInput (String value) {
		se.selectDropdown(subscriptionPaidByInput, value);
	}
	
	public void subscriptionAmountInput (String value) {
		se.enterValue(subscriptionAmountInput, value);
	}
	
	public void currencyInput (String value) {
		se.selectDropdown(currencyInput, value);
	}
	
	public void subscriptionCommenceDateInput (String value) {
		se.enterValue(subscriptionCommenceDateInput, value);
	}
	
	public void subscriptionRenewalDateInput (String value) {
		se.enterValue(subscriptionRenewalDateInput, value);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}
}
