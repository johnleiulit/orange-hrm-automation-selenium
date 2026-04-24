package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.MembershipsPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MembershipsTestCase extends Library {
	MembershipsPage mp;
	SeleniumReusable se;

	@When("Admin clicks memberships on the sidebar")
	public void admin_clicks_memberships_on_the_sidebar() {
		mp = new MembershipsPage(driver);
		mp.memberships();
	}

	@Then("should be navigated to memberships page")
	public void should_be_navigated_to_memberships_page() {
		mp.membershipsPage();
	}

	@When("Admin clicks add button on membership")
	public void admin_clicks_add_button_on_membership() {
		mp.addButton();
	}

	@When("Admin enters membership")
	public void admin_enters_membership() {
		mp.membershipInput("British Computer Society (BCS)");
	}

	@When("Admin enters subscription paid by on membership")
	public void admin_enters_subscription_paid_by_on_membership() {
		mp.subscriptionPaidByInput("Individual");
	}

	@When("Admin enters subscription amount on membership")
	public void admin_enters_subscription_amount_on_membership() {
		mp.subscriptionAmountInput("999");
	}

	@When("Admin enters currency on membership")
	public void admin_enters_currency_on_membership() {
		mp.currencyInput("Philippine Peso");
	}

	@When("Admin enters subscription commence date on membership")
	public void admin_enters_subscription_commence_date_on_membership() {
		mp.subscriptionCommenceDateInput("2026-01-04");
	}

	@When("Admin enters subscription renewal date on membership")
	public void admin_enters_subscription_renewal_date_on_membership() {
		mp.subscriptionRenewalDateInput("2027-01-04");
	}

	@When("Admin clicks save button on membership")
	public void admin_clicks_save_button_on_membership() {
		mp.saveButton();
	}

	@Then("It should show membership successfully updated")
	public void it_should_show_membership_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/membership.png");
	}

}
