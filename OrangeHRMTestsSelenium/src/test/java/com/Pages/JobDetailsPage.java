package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class JobDetailsPage extends Library {
	SeleniumReusable se;

	public JobDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}

	@FindBy(xpath = "//a[text()='Job']")
	WebElement job;

	@FindBy(xpath = "//h6[text()='Job Details']")
	WebElement jobPage;

	@FindBy(xpath = "//label[text()='Joined Date']/following::input[1]")
	WebElement joinedDateInput;

	@FindBy(xpath = "//label[text()='Job Title']/following::div[contains(@class,'oxd-select-text-input')][1]")
	WebElement jobTitleInput;
	
	@FindBy(xpath = "//label[text()='Job Category']/following::div[@class='oxd-select-text-input'='-- Select --'][1]")
	WebElement jobCategoryInput;
	
	@FindBy(xpath = "//label[text()='Sub Unit']/following::div[@class='oxd-select-text-input'][1]")
	WebElement subUnitInput;
	
	@FindBy(xpath = "//label[text()='Location']/following::div[@class='oxd-select-text-input'][1]")
	WebElement locationInput;
	
	@FindBy(xpath = "//label[text()='Employment Status']/following::div[@class='oxd-select-text-input'][1]")
	WebElement employmentStatusInput;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement enableContractDetails;
	
	@FindBy(xpath = "//label[text()='Contract Start Date']/following::input[1]")
	WebElement contractStartDateInput;
	
	@FindBy(xpath = "//label[text()='Contract End Date']/following::input[1]")
	WebElement contractEndDateInput;
	
	public void job() {
		se.click(job);
	}

	public void jobPage() {
		System.out.println(jobPage.isDisplayed());
		System.out.println(driver.getTitle());
	}

	public void joinedDateInput(String text) {
		se.enterValue(joinedDateInput, text);
	}

	public void jobTitleInput(String value)  {
		se.selectDropdown(jobTitleInput, value);
	}
	
	public void jobCategoryInput (String value) {
		se.selectDropdown(jobCategoryInput, value);
	}
	
	public void subUnitInput (String value) {
		se.selectDropdown(subUnitInput, value);
	}
	
	public void locationInput (String value) {
		se.selectDropdown(locationInput, value);
	}
	
	public void employmentStatusInput (String value) {
		se.selectDropdown(employmentStatusInput, value);
	}
	
	public void enableContractDetails () {
		se.click(enableContractDetails);
	}
	
	public void contractStartDateInput (String value) {
		se.enterValue(contractStartDateInput, value);
	}
	
	public void contractEndDateInput (String value) {
		se.enterValue(contractEndDateInput, value);
	}

}
