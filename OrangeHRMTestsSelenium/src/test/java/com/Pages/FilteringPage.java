package com.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class FilteringPage extends Library {
	SeleniumReusable se;

	public FilteringPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}

	@FindBy(xpath = "//label[text()='Employee Name']/following::input[@placeholder='Type for hints...'][1]")
	WebElement employeeNameInput;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	@FindBy(xpath = "//div[@class='orangehrm-container']")
	WebElement tableResult;

	@FindBy(xpath = "//button[@type='reset']")
	WebElement resetButton;

	@FindBy(xpath = "orangehrm-background-container")
	WebElement tableCleared;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	WebElement employeeIdInput;

	@FindBy(xpath = "//label[text()='Employment Status']/following::div[@class='oxd-select-text-input'][1]")
	WebElement employmentStatusInput;

	@FindBy(xpath = "//label[text()='Include']/following::div[@class='oxd-select-text-input'][1]")
	WebElement includeInput;

	@FindBy(xpath = "//label[text()='Supervisor Name']/following::input[1]")
	WebElement supervisorNameInput;

	@FindBy(xpath = "//label[text()='Job Title']/following::div[@class='oxd-select-text-input'][1]")
	WebElement jobTitleInput;

	@FindBy(xpath = "//label[text()='Sub Unit']/following::div[@class='oxd-select-text-input'][1]")
	WebElement subUnitInput;

	public void employeeNameInput(String text, String expectedName) {
		se.enterValue(employeeNameInput, text);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> options = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']//span")));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(expectedName)) {
				option.click();
				break;
			}
		}
	}

	public void searchButton() {
		se.click(searchButton);
	}

	public void tableResult() {
		se.scrollDown(tableResult);

	}

	public void resetButton() {
		se.scrollUp(resetButton);
		se.click(resetButton);
	}

	public void tableCleared() {
		se.screenShot("src/test/resources/Screenshot/Filtering/tableCleared.png");
	}

	public void employeeIdInput(String value) {
		se.enterValue(employeeIdInput, value);
	}

	public void employmentStatusInput(String value) {
		se.selectDropdown(employmentStatusInput, value);
	}

	public void includeInput(String value) {
		se.selectDropdown(includeInput, value);
	}

	public void supervisorNameInput(String text, String expectedName) {
		se.enterValue(supervisorNameInput, text);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> options = wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']//span")));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(expectedName)) {
				option.click();
				break;
			}
		}
	}

	public void jobTitleInput(String value) {
		se.selectDropdown(jobTitleInput, value);
	}

	public void subUnitInput(String value) {
		se.selectDropdown(subUnitInput, value);
	}

	public void allFields(String empNameText, String empNameValue, String empId, String empStatus, String include,
			String supervisorText, String supervisorValue, String jobTitle, String subUnit) {

		employeeNameInput(empNameText, empNameValue);
		employeeIdInput(empId);
		employmentStatusInput(empStatus);
		includeInput(include);
		supervisorNameInput(supervisorText, supervisorValue);
		jobTitleInput(jobTitle);
		subUnitInput(subUnit);
	}

}
