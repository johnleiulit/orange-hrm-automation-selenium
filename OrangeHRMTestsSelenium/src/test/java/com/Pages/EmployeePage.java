package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class EmployeePage extends Library {
	SeleniumReusable se;

	public EmployeePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//html")
	WebElement loginPage;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameInput;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordInput;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//html")
	WebElement adminPage;

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pim;

	@FindBy(xpath = "//html")
	WebElement pimResult;

	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement addButton;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameInput;

	@FindBy(xpath = "//input[@name='middleName']")
	WebElement middleNameInput;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameInput;
	
	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	WebElement employeeIdInput;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
	WebElement checkbox;
	
	@FindBy(xpath= "//label[text()='Username']/following::input[1]")
	WebElement userNameInput2;
	
	@FindBy(xpath= "//label[text()='Username']/following::input[4]")
	WebElement passwordInput2;
	
	@FindBy(xpath= "//label[text()='Username']/following::input[5]")
	WebElement confirmPassword2;
	
	@FindBy(xpath="//button[text()=' Save ']")
	WebElement saveButton;

	public void loginPage() {
		se = new SeleniumReusable(driver);
		System.out.println(driver.getTitle());
	}

	public void usernameInput(String text) {
		se.enterValue(userNameInput, text);
	}

	public void passwordInput(String text) {
		se.enterValue(passwordInput, text);
	}

	public void submitButton() {
		se.click(submitButton);
	}

	public void adminPage() {
		System.out.println(driver.getTitle());
	}

	public void pim() {
		se.click(pim);
	}

	public void pimResult() {
		System.out.println(driver.getTitle());
	}

	public void addButton() {
		se.click(addButton);
	}

	public void firstNameInput(String text) {
		se.enterValue(firstNameInput, text);
	}

	public void middleNameInput(String text) {
		se.enterValue(middleNameInput, text);
	}

	public void lastNameInput(String text) {
		se.enterValue(lastNameInput, text);
	}
	
	public void employeeIdInput (String text) {
		employeeIdInput.click();
		employeeIdInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		employeeIdInput.sendKeys(Keys.DELETE);
		se.enterValue(employeeIdInput, text);
	}

	public void checkbox() {
		se.click(checkbox);
	}
	
	public void userNameInput2 (String text) {
		se.enterValue(userNameInput2, text);
	}
	
	public void passwordInput2 (String text) {
		se.enterValue(passwordInput2, text);
	}
	
	public void confirmPassword2 (String text) {
		se.enterValue(confirmPassword2, text);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}

}
