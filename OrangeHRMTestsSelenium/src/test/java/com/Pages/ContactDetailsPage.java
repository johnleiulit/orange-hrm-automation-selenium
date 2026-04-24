package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class ContactDetailsPage extends Library {
	SeleniumReusable se;

	public ContactDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}

	@FindBy(xpath = "//a[text()='Contact Details']")
	WebElement contactDetails;

	@FindBy(xpath = "//html")
	WebElement contactDetailsPage;

	@FindBy(xpath = "//label[text()='Street 1']/following::input[1]")
	WebElement street1Input;

	@FindBy(xpath = "//label[text()='Street 2']/following::input[1]")
	WebElement street2Input;

	@FindBy(xpath = "//label[text()='City']/following::input[1]")
	WebElement cityInput;

	@FindBy(xpath = "//label[text()='State/Province']/following::input[1]")
	WebElement stateProvinceInput;

	@FindBy(xpath = "//label[text()='Zip/Postal Code']/following::input[1]")
	WebElement zipPostalCodeInput;

	@FindBy(xpath = "//label[text()='Country']/following::div[@class='oxd-select-text-input'][1]")
	WebElement countryInput;

	@FindBy(xpath = "//label[text()='Home']/following::input[1]")
	WebElement homeInput;

	@FindBy(xpath = "//label[text()='Mobile']/following::input[1]")
	WebElement mobileInput;
	
	@FindBy(xpath = "//label[text()='Work']/following::input[1]")
	WebElement workInput;
	
	@FindBy(xpath = "//label[text()='Work Email']/following::input[1]")
	WebElement workEmailInput;
	
	@FindBy(xpath = "//label[text()='Other Email']/following::input[1]")
	WebElement otherEmailInput;
	
	public void contactDetails() {
		se.click(contactDetails);
	}

	public void contactDetailsPage() {
		System.out.println(contactDetailsPage.isDisplayed());
		System.out.println(driver.getTitle());
	}

	public void street1Input(String text) {
		se.enterValue(street1Input, text);
	}

	public void street2Input(String text) {
		se.enterValue(street2Input, text);
	}

	public void cityInput(String text) {
		se.enterValue(cityInput, text);
	}

	public void stateProvinceInput(String text) {
		se.enterValue(stateProvinceInput, text);
	}

	public void zipPostalCodeInput(String text) {
		se.enterValue(zipPostalCodeInput, text);
	}

//	public void countryInput(String value) {
//		se.click(countryInput);
//		driver.findElement(By.xpath("//div[contains(text(),'" + value + "')]")).click();
//	}
	public void countryInput(String value) throws InterruptedException {
	    try {
	        // Scroll to the country dropdown
//	        se.scrollDown(countryInput);
//	        Thread.sleep(500);
	        
	        // Click to open the dropdown
	        se.click(countryInput);
	        Thread.sleep(1000);
	        
	        // Type the country name to filter the list
	        countryInput.sendKeys(value);
	        Thread.sleep(1000);
	        
	        // Now click the filtered option
	        WebElement option = driver.findElement(By.xpath("//div[@role='option']//span[text()='" + value + "']"));
	        option.click();
	        
	        System.out.println("Country selected: " + value);
	    } catch (Exception e) {
	        System.out.println("Error selecting Country: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	public void homeInput(String text) {
		se.enterValue(homeInput, text);
	}
	
	public void mobileInput (String text) {
		se.enterValue(mobileInput, text);
	}
	
	public void workInput (String text) {
		se.enterValue(workInput, text);
	}
	
	public void workEmailInput (String text) {
		se.enterValue(workEmailInput, text);
	}
	
	public void otherEmailInput (String text) {
		se.enterValue(otherEmailInput, text);
	}

}
