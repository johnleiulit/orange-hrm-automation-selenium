package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class LanguagesPage extends Library {
	SeleniumReusable se;

	public LanguagesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath = "//h6[text()='Languages']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Language']/following::div[@class='oxd-select-text-input'][1]")
	WebElement languageInput;
	
	@FindBy(xpath = "//label[text()='Fluency']/following::div[@class='oxd-select-text-input'][1]")
	WebElement fluencyInput;
	
	@FindBy(xpath = "//label[text()='Competency']/following::div[@class='oxd-select-text-input'][1]")
	WebElement competencyInput;
	
	@FindBy(xpath = "//label[text()='Comments']/following::textarea[1]")
	WebElement commentsInput;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void languageInput (String value) {
		se.click(languageInput);
		se.selectDropdown(languageInput, value);
	}
	
	public void fluencyInput (String value) {
		se.selectDropdown(fluencyInput, value);
	}
	
	public void competencyInput (String value) {
		se.selectDropdown(competencyInput, value);
	}
	
	public void commentsInput (String value) {
		se.enterValue(commentsInput, value);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}
}
