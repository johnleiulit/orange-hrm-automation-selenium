package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.LicensePage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LicenseTestCase extends Library {
	SeleniumReusable se;
	LicensePage lp;

	@When("Admin clicks add butto on license")
	public void admin_clicks_add_butto_on_license() throws InterruptedException {
		lp = new LicensePage(driver);
		lp.addButton();
		Thread.sleep(5000);
	}

	@When("Admin enters license type")
	public void admin_enters_license_type() {
		lp.lincenseTypeInput("Cisco Certified Network Associate (CCNA)");
	}

	@When("Admin enters license number")
	public void admin_enters_license_number() {
		lp.licenseNumberInput(null);
	}

	@When("Admin enters issued date on license")
	public void admin_enters_issued_date_on_license() {
		lp.issuedDateInput("2024-15-01");
	}

	@When("Admin enters expiry date on license")
	public void admin_enters_expiry_date_on_license() {
		lp.expiryDateInput("2027-15-01");
	}

	@When("Admin clicks save button on license")
	public void admin_clicks_save_button_on_license() {
		lp.saveButton();
	}

	@Then("It should show license successfully updated")
	public void it_should_show_license_successfullu_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/license.png");
		
	}
}
