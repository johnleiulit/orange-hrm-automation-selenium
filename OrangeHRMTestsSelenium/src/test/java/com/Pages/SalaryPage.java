package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class SalaryPage extends Library{
	SeleniumReusable se;
	public SalaryPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath = "//a[text()='Salary']")
	WebElement salary;
	
	@FindBy(xpath = "//h6[text()='Assigned Salary Components']")
	WebElement salaryPage;
	
	@FindBy(xpath = "//h6[text()='Assigned Salary Components']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Salary Component']/following::input[1]")
	WebElement salaryComponentInput;
	
	@FindBy(xpath = "//label[text()='Pay Grade']/following::div[@class='oxd-select-text oxd-select-text--active'][1]")
	WebElement payGradeInput;
	
	@FindBy(xpath = "//label[text()='Pay Frequency']/following::div[@class='oxd-select-text oxd-select-text--active'][1]")
	WebElement payFrequencyInput;
	
	@FindBy(xpath = "//label[text()='Currency']/following::div[@class='oxd-select-text oxd-select-text--active'][1]")
	WebElement currencyInput;
	
	@FindBy(xpath = "//label[text()='Amount']/following::input[1]")
	WebElement amountInput;
	
	@FindBy(xpath = "//label[text()='Comments']/following::textarea[1]")
	WebElement commentsInput;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement enableDepositDetails;
	
	@FindBy(xpath = "//label[text()='Account Number']/following::input[1]")
	WebElement accountNumberInput;
	
	@FindBy(xpath = "//label[text()='Account Type']/following::div[@class='oxd-select-text oxd-select-text--active'][1]")
	WebElement accountTypeInput;
	
	@FindBy(xpath = "//label[text()='Routing Number']/following::input[1]")
	WebElement routingNumberInput;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div[2]/div[2]/div/div[2]/input")
	WebElement depositDetailsAmount;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	
	public void salary () {
		se.click(salary);
	}
	
	public void salaryPage () {
		System.out.println(salaryPage.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void salaryComponentInput (String value) {
		se.enterValue(salaryComponentInput, value);
	}
	
	public void payGradeInput (String value) {
		se.selectDropdown(payGradeInput, value);
	}
	
	public void payFrequencyInput (String value) {
		se.selectDropdown(payFrequencyInput, value);
	}
	
	public void currencyInput (String value) {
		se.selectDropdown(currencyInput, value);
	}
	
	public void amountInput (String value) {
		se.enterValue(amountInput, value);
	}
	
	public void commentsInput (String value) {
		se.enterValue(commentsInput, value);
	}
	
	public void enableDepositDetails () {
		se.click(enableDepositDetails);
	}
	
	public void accountNumberInput (String value) {
		se.enterValue(accountNumberInput, value);
	}
	
	public void accountTypeInput (String value) {
		se.selectDropdown(accountTypeInput, value);
	}
	
	public void routingNumberInput (String value) {
		se.enterValue(routingNumberInput, value);
	}
	
	public void depositDetailsAmount (String value) {
		se.enterValue(depositDetailsAmount, value);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}

}
