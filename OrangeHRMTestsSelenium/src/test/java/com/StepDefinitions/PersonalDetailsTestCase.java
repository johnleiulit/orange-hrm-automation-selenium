package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.PersonalDetailsPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailsTestCase extends Library{
	PersonalDetailsPage pdp;
	SeleniumReusable se;
	@When("Admin enters other id")
	public void admin_enters_other_id() throws InterruptedException {
		pdp = new PersonalDetailsPage(driver);
		Thread.sleep(10000);		
		pdp.otherIdInput("1234");
	}


	@When("Admin enters license expiry date")
	public void admin_enters_license_expiry_date() {
		pdp.licenseExpiryDateInput("2029-29-03");
	}
	@When("Admin enters driver license number")
	public void admin_enters_driver_license_number() {
		pdp.driverLicenseNumberInput("N01-23-456789");
	}

	@When("Admin enters nationality")
	public void admin_enters_nationality() throws InterruptedException {
		pdp.selectNationality("Filipino");
	
	}

	@When("Admin enters marital status")
	public void admin_enters_marital_status() {
		pdp.martialStatusInput("Single");
	}

	@When("Admin enters Date of Birth")
	public void admin_enters_date_of_birth() {
		pdp.dateOfBirthInput("2003-07-09");
	}

	@When("Admin enters gender")
	public void admin_enters_gender() {
		pdp.maleInput();
	}

	@Then("Employee should be updated successfully")
	public void employee_should_be_updated_successfully() throws InterruptedException {
		se = new SeleniumReusable(driver);
		pdp.result();
		Thread.sleep(10000);
		se.screenShot("src/test/resources/Screenshot/personalDetails1.png");
	}
}
