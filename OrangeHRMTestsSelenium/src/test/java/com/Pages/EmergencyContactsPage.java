package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class EmergencyContactsPage extends Library{
	SeleniumReusable se;
	
	public EmergencyContactsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath = "//a[text()='Emergency Contacts']")
	WebElement emergencyContacts;
	
	@FindBy(xpath = "//html")
	WebElement emergencyContactsPage;
	
	@FindBy(xpath = "//h6[text()='Assigned Emergency Contacts']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Name']/following::input[1]")
	WebElement nameInput;
	
	@FindBy(xpath = "//label[text()='Relationship']/following::input[1]")
	WebElement relationshipInput;
	
	@FindBy(xpath = "//label[text()='Home Telephone']/following::input[1]")
	WebElement homeTelephoneInput;
	
	@FindBy(xpath = "//label[text()='Mobile']/following::input[1]")
	WebElement mobileInput;
	
	@FindBy(xpath = "//label[text()='Work Telephone']/following::input[1]")
	WebElement workTelephoneInput;
	
	
	
	public void emergencyContacts () {
		se.click(emergencyContacts);
	}
	
	public void emergencyContactsPage () {
		System.out.println(emergencyContactsPage.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void nameInput (String text) {
		se.enterValue(nameInput, text);
	}
	
	public void relationshipInput (String text) {
		se.enterValue(relationshipInput, text);
	}
	
	public void homeTelephoneInput (String text) {
		se.enterValue(homeTelephoneInput, text);
	}
	
	public void mobileInput (String text) {
		se.enterValue(mobileInput, text);
	}
	
	public void workTelephoneInput (String text) {
		se.enterValue(workTelephoneInput, text);
	}

}
