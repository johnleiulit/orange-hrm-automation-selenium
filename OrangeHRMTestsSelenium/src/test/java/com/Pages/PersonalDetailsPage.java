package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class PersonalDetailsPage extends Library {

	SeleniumReusable se;
	WebDriverWait wait;

	public PersonalDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}

	@FindBy(xpath = "//label[text()='Other Id']/following::input[1]")
	WebElement otherIdInput;

	@FindBy(xpath = "//label[text()='Other Id']/following::input[2]")
	WebElement driverLicenseNumberInput;

	@FindBy(xpath = "//label[text()='License Expiry Date']/following::input[1]")
	WebElement licenseExpiryDateInput;

	@FindBy(xpath = "//label[text()='Nationality']/following::div[@class='oxd-select-text-input'][1]")
	WebElement nationalityInput;
	
	@FindBy(xpath = "//label[text()='Marital Status']/following::div[@class='oxd-select-text-input'][1]")
	WebElement martialStatusInput;
	
	@FindBy(xpath="//label[text()='Date of Birth']/following::input[1]")
	WebElement dateOfBirthInput;
	
	@FindBy(xpath="//label[normalize-space()='Male']/span")
	WebElement maleInput;
	
	@FindBy(xpath="(//button[text()=' Save '])[1]")
	WebElement saveButton;
	
	@FindBy(xpath ="//html")
	WebElement result;


	public void driverLicenseNumberInput(String text) {
		se.enterValue(driverLicenseNumberInput, text);
	}

	public void licenseExpiryDateInput(String text) {
		se.enterValue(licenseExpiryDateInput, text);
	}
	
	public void otherIdInput(String text) {
		se.enterValue(otherIdInput, text);
	}

	public void selectNationality(String value) {
	    se.click(nationalityInput);
	    driver.findElement(By.xpath("//span[text()='" + value + "']")).click();
	}
	
	public void martialStatusInput (String value) {
		se.click(martialStatusInput);
		 driver.findElement(By.xpath("//span[text()='" + value + "']")).click();
	}
	
	public void dateOfBirthInput(String text) {
		se.enterValue(dateOfBirthInput, text);
	}
	
	public void maleInput () {
		se.click(maleInput);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}
	
	public void result() {
		se.getTitle();
	}


}
