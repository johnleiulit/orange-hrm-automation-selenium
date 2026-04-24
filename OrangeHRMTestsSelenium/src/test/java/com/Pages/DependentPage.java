package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class DependentPage extends Library{
	SeleniumReusable se;
	
	public DependentPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusable(driver);
	}
	
	@FindBy(xpath ="//a[text()='Dependents']")
	WebElement dependents;
	
	@FindBy(xpath = "//html")
	WebElement dependentsPage;
	
	@FindBy(xpath = "//h6[text()='Assigned Dependents']/following::button[1]")
	WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Name']/following::input[1]")
	WebElement nameInput;
	
	@FindBy(xpath = "//label[text()='Relationship']/following::div[@class='oxd-select-text-input']")
	WebElement relationshipDropdown;
	
	@FindBy(xpath = "//label[text()='Please Specify']/following::input[1]")
	WebElement pleaseSpecifyInput;
	
	@FindBy(xpath = "//label[text()='Date of Birth']/following::input[1]")
	WebElement dateOfBirthInput;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	public void dependents () {
		se.click(dependents);
	}
	
	public void dependentsPage () {
		System.out.println(dependentsPage.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void addButton () {
		se.click(addButton);
	}
	
	public void nameInput (String text) {
		se.enterValue(nameInput, text);
	}
	
	public void relationshipDropdown(String relationship) throws InterruptedException {
	    try {
	        se.click(relationshipDropdown);
	    
	        // Click the relationship option
	        WebElement option = driver.findElement(
	            By.xpath("//div[@role='option']//span[text()='" + relationship + "']")
	        );
	        option.click();
	        System.out.println("Relationship selected: " + relationship);
	    } catch (Exception e) {
	        System.out.println("Error selecting Relationship: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	
	public void pleaseSpecifyInput (String text) {
		se.enterValue(pleaseSpecifyInput, text);
	}
	
	public void dateOfBirthInput (String text) {
		se.enterValue(dateOfBirthInput, text);
	}
	
	public void saveButton (String text) {
		se.enterValue(saveButton, text);
	}
}
