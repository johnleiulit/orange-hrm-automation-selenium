package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;
import java.time.Duration;
import java.util.List;

public class ReportToPage extends Library {
	SeleniumReusable se;

	public ReportToPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}

	@FindBy(xpath = "//a[text()='Report-to']")
	WebElement reportTo;

	@FindBy(xpath = "//h6[text()='Report to']")
	WebElement reportToPage;

	@FindBy(xpath = "//h6[text()='Assigned Supervisors']/following::button[1]")
	WebElement addButton;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement nameInput;

	@FindBy(xpath = "//label[text()='Reporting Method']/following::div[@class='oxd-select-text oxd-select-text--active']")
	WebElement reportingMethodInput;

	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;

	public void reportTo() {
		se.click(reportTo);
	}

	public void reportToPage() {
		System.out.println(reportToPage.isDisplayed());
		System.out.println(driver.getTitle());
	}

	public void addButton() {
		se.click(addButton);
	}

	public void nameInput(String text, String expectedName) {
		se.enterValue(nameInput, text);
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

	public void reportingMethodInput(String value) {
		se.selectDropdown(reportingMethodInput, value);
	}

	public void saveButton() {
		se.click(saveButton);
	}

}
