package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class QualificationsPage extends Library {
	SeleniumReusable se;

	public QualificationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath = "//a[text()='Qualifications']")
	WebElement qualifications;
	
	@FindBy(xpath = "//h6[text()='Qualifications']")
	WebElement qualificationsPage;
	
	@FindBy(xpath = "//h6[text()='Work Experience']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Company']/following::input[1]")
	WebElement companyInput;
	
	@FindBy(xpath = "//label[text()='Job Title']/following::input[1]")
	WebElement jobTitleInput;
	
	@FindBy(xpath = "//label[text()='From']/following::input[1]")
	WebElement fromDateInput;
	
	@FindBy(xpath = "//label[text()='To']/following::input[1]")
	WebElement toDateInput;
	
	@FindBy(xpath = "//label[text()='Comment']/following::textarea[1]")
	WebElement commentInput;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	public void qualifications () {
		se.click(qualifications);
	}
	
	public void qualificationsPage () {
		System.out.println("Welcome to" + qualificationsPage.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void companyInput (String value) {
		se.enterValue(companyInput, value);
	}
	
	public void jobTitleInput (String value) {
		se.enterValue(jobTitleInput, value);
	}
	
	public void fromDateInput (String value) {
		se.enterValue(fromDateInput, value);
	}
	
	public void toDateInput (String value) {
		se.enterValue(toDateInput, value);
	}
	
	public void commentInput (String value) {
		se.enterValue(commentInput, value);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}

}
