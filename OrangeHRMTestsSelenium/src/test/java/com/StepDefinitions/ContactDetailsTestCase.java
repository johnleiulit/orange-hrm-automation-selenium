package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.ContactDetailsPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactDetailsTestCase extends Library{
	ContactDetailsPage cdp;
	SeleniumReusable se;
	
	@When("Admin clicks contact details on the sidebar")
	public void admin_clicks_contact_details_on_the_sidebar() throws InterruptedException {
		se = new SeleniumReusable(driver);
		cdp = new ContactDetailsPage(driver);
		cdp.contactDetails();
		Thread.sleep(5000);
	}

	@Then("Admin should be navigated to contact details page")
	public void admin_should_be_navigated_to_contact_details_page() {
	   cdp.contactDetailsPage();
	}

	@When("Admin enters street 1")
	public void admin_enters_street_1() {
	    cdp.street1Input("Purok Santolan");
	}

	@When("Admin enters street 2")
	public void admin_enters_street_2() {
	    cdp.street2Input("St.Jude 7a");
	}

	@When("Admin enters city")
	public void admin_enters_city() {
		cdp.cityInput("Quezon City");
	}

	@When("Admin enters state\\/province")
	public void admin_enters_state_province() {
		cdp.stateProvinceInput("Metro Manila");
	}

	@When("Admin enters zip\\/postal code")
	public void admin_enters_zip_postal_code() {
		cdp.zipPostalCodeInput("5301");
	}

	@When("Admin enters country")
	public void admin_enters_country() throws InterruptedException {
	   cdp.countryInput("Philippines");
	}

	@When("Admin enters home")
	public void admin_enters_home() {
		cdp.homeInput("+63 32 123 4567");
	}

	@When("Admin enters mobile")
	public void admin_enters_mobile() {
		cdp.mobileInput("09384426811");
	}

	@When("Admin enters work")
	public void admin_enters_work() {
		cdp.workInput("09115417891");
	}

	@When("Admin enters work email")
	public void admin_enters_work_email() {
		cdp.workEmailInput("workemail13@yahoo.com");
	}

	@When("Admin enters other email")
	public void admin_enters_other_email() {
	   cdp.otherEmailInput("otheremail13@yahoo.com");
	}

	@Then("It should show successfully updated")
	public void it_should_show_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/contactDetails.png");
	}

}
