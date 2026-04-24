package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class ImmigrationPage extends Library{
	SeleniumReusable se;
	
	public ImmigrationPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);	
	}
	
	@FindBy(xpath = "//a[text()='Immigration']")
	WebElement immigration;
	
	@FindBy(xpath = "//h6[text()='Assigned Immigration Records']")
	WebElement immigrationPage;
	
	@FindBy(xpath = "//h6[text()='Assigned Immigration Records']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Number']/following::input[1]")
	WebElement numberInput;
	
	@FindBy(xpath = "//label[text()='Issued Date']/following::input[1]")
	WebElement issuedDateInput;
	
	@FindBy(xpath = "//label[text()='Expiry Date']/following::input[1]")
	WebElement expiryDateInput;
	
	@FindBy(xpath = "//label[text()='Eligible Status']/following::input[1]")
	WebElement eligibleStatusInput;
	
	@FindBy(xpath = "//label[text()='Issued By']/following::div[text()='-- Select --']")
	WebElement issuedByInput;
	
	@FindBy(xpath = "//label[text()='Eligible Review Date']/following::input[1]")
	WebElement eligibleReviewDateInput;
	
	@FindBy(xpath = "//label[text()='Comments']/following::textarea")
	WebElement commentsInput;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	public void immigration () {
		se.click(immigration);
	}
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void immigrationPage () {
		System.out.println(immigrationPage.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void numberInput (String text) {
		se.enterValue(numberInput, text);
	}
	
	public void issuedDateInput (String text) {
		se.enterValue(issuedDateInput, text);
	}
	
	public void expiryDateInput (String text) {
		se.enterValue(expiryDateInput, text);
	}
	
	public void eligibleStatusInput (String text) {
		se.enterValue(eligibleStatusInput, text);
	}
	
	public void issuedByInput (String value) throws InterruptedException {
		se.click(issuedByInput);
		issuedByInput.sendKeys(value);
		Thread.sleep(1000);
		 // Now click the filtered option
        WebElement option = driver.findElement(By.xpath("//div[@role='option']//span[text()='" + value + "']"));
        option.click();
	}
	
	public void eligibleReviewDateInput (String text) {
		se.enterValue(eligibleReviewDateInput, text);
	}
	
	public void commentsInput (String text) {
		se.enterValue(commentsInput, text);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}

}
