package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class LicensePage extends Library {
	SeleniumReusable se;

	public LicensePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath = "//h6[text()='License']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='License Type']/following::div[@class='oxd-select-text-input'][1]")
	WebElement lincenseTypeInput;
	
	@FindBy(xpath = "//label[text()='License Number']/following::input[1]")
	WebElement licenseNumberInput;
	
	@FindBy(xpath = "//label[text()='Issued Date']/following::input[1]")
	WebElement issuedDateInput;
	
	@FindBy(xpath = "//label[text()='Expiry Date']/following::input[1]")
	WebElement expiryDateInput;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void lincenseTypeInput (String value) {
		se.selectDropdown(lincenseTypeInput, value);
	}
	
	public void licenseNumberInput (String value) {
		se.enterValue(licenseNumberInput, value);
	}
	
	public void issuedDateInput (String value) {
		se.enterValue(issuedDateInput, value);
	}
	
	public void expiryDateInput (String value) {
		se.enterValue(expiryDateInput, value);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}
}
