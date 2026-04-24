package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.DependentPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DependentTestCase extends Library {
	DependentPage dp;
	SeleniumReusable se;

	@When("Admin clicks dependents on the sidebar")
	public void admin_clicks_dependents_on_the_sidebar() throws InterruptedException {
		dp = new DependentPage(driver);
		se = new SeleniumReusable(driver);
		dp.dependents();
		Thread.sleep(5000);
	}

	@Then("Admin should be navigated to dependents page")
	public void admin_should_be_navigated_to_dependents_page() {
		dp.dependentsPage();
	}

	@When("Admin clicks add button on dependents")
	public void admin_clicks_add_button_on_dependents() {
		dp.addButton();
	}

	@When("Admin enters dependent name")
	public void admin_enters_dependent_name() {
		dp.nameInput("John Dor");
	}

	@When("Admin enters dependent relationship")
	public void admin_enters_dependent_relationship() throws InterruptedException {
		dp.relationshipDropdown("Other");
	}

	@When("Admin enters specify relationship")
	public void admin_enters_specify_relationship() {
		dp.pleaseSpecifyInput("Parent");
	}

	@When("Admin selects dependent date of birth")
	public void admin_selects_dependent_date_of_birth() {
		dp.dateOfBirthInput("1977-01-05");
	}

	@Then("It should show dependent successfully updated")
	public void it_should_show_dependent_successfully_updated() throws InterruptedException {
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/dependents.png");
	}

}
