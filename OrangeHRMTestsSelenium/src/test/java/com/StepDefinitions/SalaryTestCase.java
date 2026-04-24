package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.SalaryPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalaryTestCase extends Library {
	SalaryPage sp;
	SeleniumReusable se;

	@When("Admin clicks salary on the sidebar")
	public void admin_clicks_salary_on_the_sidebar() {
		sp = new SalaryPage(driver);
		sp.salary();
	}

	@Then("should be navigated to salary page")
	public void should_be_navigated_to_salary_page() {
		sp.salaryPage();
	}

	@When("Admin clicks add button on salary")
	public void admin_clicks_add_button_on_salary() {
		sp.addButton();
	}

	@When("Admin enters salary components on salary")
	public void admin_enters_salary_components_on_salary() {
		sp.salaryComponentInput("Basic Salary");
	}

	@When("Admin enters pay grade on salary")
	public void admin_enters_pay_grade_on_salary() {
		sp.payGradeInput("Grade 2");
	}

	@When("Admin enters pay frequency on salary")
	public void admin_enters_pay_frequency_on_salary() {
		sp.payFrequencyInput("Monthly");
	}

	@When("Admin enters currecncy on salary")
	public void admin_enters_currecncy_on_salary() {
		sp.currencyInput("United States Dollar");
	}

	@When("Admin enters ammount on salary")
	public void admin_enters_ammount_on_salary() {
		sp.amountInput("45000");
	}

	@When("Admin enters comments on salary")
	public void admin_enters_comments_on_salary() {
		sp.commentsInput("Monthly basic salary as per employment contract");
	}

	@When("Enable deposit details on salary")
	public void enable_deposit_details_on_salary() {
		sp.enableDepositDetails();
	}

	@When("Admin enters account number on deposit details")
	public void admin_enters_account_number_on_deposit_details() {
		sp.accountNumberInput("1234-5678-9012");
	}

	@When("Admin enters account type on deposit details")
	public void admin_enters_account_type_on_deposit_details() {
		sp.accountTypeInput("Savings");
	}

	@When("Admin enters routing number on deposit details")
	public void admin_enters_routing_number_on_deposit_details() {
		sp.routingNumberInput("021000021");
	}

	@When("Admin enters ammount on deposit details")
	public void admin_enters_ammount_on_deposit_details() {
		sp.depositDetailsAmount("45000");
	}
	
	@When("Admin clicks save button on salary")
	public void admin_clicks_save_button_on_salary() {
		sp.saveButton();
	}


	@Then("It should show salary successfully updated")
	public void it_should_show_salary_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/salary.png");
	}

}
