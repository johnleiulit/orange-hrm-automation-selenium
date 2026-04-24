package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class EducationPage extends Library{
	SeleniumReusable se;
	
	public EducationPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	} 
	
	@FindBy(xpath = "//h6[text()='Education']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Level']/following::div[@class='oxd-select-text-input']")
	WebElement levelInput;
	
	@FindBy(xpath = "//label[text()='Institute']/following::input[1]")
	WebElement instituteInput;
	
	@FindBy(xpath = "//label[text()='Major/Specialization']/following::input[1]")
	WebElement majorInput;
	
	@FindBy(xpath = "//label[text()='Year']/following::input[1]")
	WebElement yearInput;
	
	@FindBy(xpath = "//label[text()='GPA/Score']/following::input[1]")
	WebElement gpaInput;
	
	@FindBy(xpath = "//label[text()='Start Date']/following::input[1]")
	WebElement startDateInput;
	
	@FindBy(xpath = "//label[text()='End Date']/following::input[1]")
	WebElement endDateInput;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void levelInput (String value) {
		se.selectDropdown(levelInput, value);
	}
	
	public void instituteInput (String value) {
		se.enterValue(instituteInput, value);
	}
	
	public void majorInput (String value) {
		se.enterValue(majorInput, value);
	}
	
	public void yearInput (String value) {
		se.enterValue(yearInput, value);
	}
	
	public void gpaInput (String value) {
		se.enterValue(gpaInput, value);
	}
	
	public void startDateInput (String value) {
		se.enterValue(startDateInput, value);
	}
	
	public void endDateInput (String value) {
		se.enterValue(endDateInput, value);
	}
	
	public void saveButton (String value) {
		se.click(saveButton);
	}

}
