package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class SkillsPage extends Library {
	SeleniumReusable se;
	public SkillsPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath = "//h6[text()='Skills']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Skill']/following::div[@class='oxd-select-text-input'][1]")
	WebElement skillInput;
	
	@FindBy(xpath = "//label[text()='Years of Experience']/following::input[1]")
	WebElement yearsExperienceInput;
	
	@FindBy(xpath = "//label[text()='Comments']/following::textarea[1]")
	WebElement commentsInput;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void skillInput (String value) {
		se.selectDropdown(skillInput, value);
	}
	
	public void yearsExperienceInput (String value) {
		se.enterValue(yearsExperienceInput, value);
	}
	
	public void commentsInput (String value) {
		se.enterValue(commentsInput, value);
	}
	
	public void saveButton () {
		se.click(saveButton);
	}
}
