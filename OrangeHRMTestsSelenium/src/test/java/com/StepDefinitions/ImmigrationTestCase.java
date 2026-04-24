package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.ImmigrationPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImmigrationTestCase extends Library {
	ImmigrationPage ip;
	SeleniumReusable se;

	@When("Admin clicks immigration on the sidebar")
	public void admin_clicks_immigration_on_the_sidebar() throws InterruptedException {
		ip = new ImmigrationPage(driver);
		ip.immigration();
		Thread.sleep(5000);
	}

	@Then("Admin should be navigated to immigration page")
	public void admin_should_be_navigated_to_immigration_page() {
		ip.immigrationPage();
	}

	@When("Admin clicks add button on immigration")
	public void admin_clicks_add_button_on_immigration() {
		ip.addButton();
	}

	@When("Admin enters number immigration")
	public void admin_enters_number_immigration() {
		ip.numberInput("P1234567A");
	}

	@When("Admin enters issued date immigration")
	public void admin_enters_issued_date_immigration() {
		ip.issuedDateInput("2020-03-15");
	}

	@When("Admin enters expiry date immigration")
	public void admin_enters_expiry_date_immigration() {
		ip.expiryDateInput("2030-03-14");
	}

	@When("Admin enters eligible status immigration")
	public void admin_enters_eligible_status_immigration() {
		ip.eligibleStatusInput("Work Visa Holder");
	}

	@When("Admin enters issued by immigration")
	public void admin_enters_issued_by_immigration() throws InterruptedException {
		ip.issuedByInput("Philippines");
	}

	@When("Admin enters eligible review date immigration")
	public void admin_enters_eligible_review_date_immigration() {
		ip.eligibleReviewDateInput("2025-03-15");
	}

	@When("Admin enters comments immigration")
	public void admin_enters_comments_immigration() {
		ip.commentsInput("Passport issued by the Department of Foreign Affairs, Philippines. Valid for 10 years. Employee is currently on an active work permit. Please review eligibility status upon renewal.");
	}

	@When("Admin clicks save button immigration")
	public void admin_clicks_save_button_immigration() {
		ip.saveButton();
	}

	@Then("It should show immigration successfully updated")
	public void it_should_show_immigration_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/immigration.png");
	}

}
