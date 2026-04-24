package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.EmployeePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeTestCase extends Library {
	EmployeePage ep;

	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {
		ep = new EmployeePage(driver);
		ep.loginPage();
	}

	@When("Admin enters valid credentials")
	public void admin_enters_valid_credentials() {
		ep.usernameInput("Admin");
		ep.passwordInput("admin123");
		ep.submitButton();
	}

	@Then("It should navigate to Admin Dashboard")
	public void it_should_navigate_to_admin_dashboard() {
		ep.adminPage();
	}

	@Given("Admin is on the Dashboard")
	public void admin_is_on_the_dashboard() {
		ep.adminPage();
	}

	@When("Admin clicks the PIM on the sidebar")
	public void admin_clicks_the_pim_on_the_sidebar() {
		ep.pim();
	}

	@Then("It should navigate to PIM section")
	public void it_should_navigate_to_pim_section() {
		ep.pimResult();
	}

	@When("Admin clicks add button")
	public void admin_clicks_add_button() {
		ep.addButton();
	}

	@When("Admin input the firstname field")
	public void admin_input_the_firstname_field() {
		ep.firstNameInput("John Lei");
	}

	@When("Admin input the middlename field")
	public void admin_input_the_middlename_field() {
		ep.middleNameInput("Test");
	}

	@When("Admin input the lastname field")
	public void admin_input_the_lastname_field() {
		ep.lastNameInput("Tester");
	}
	@When("Admin input the employee id")
	public void admin_input_the_employee_id() {
	   ep.employeeIdInput("0111");
	}

	@When("Admin enable the create login details")
	public void admin_enable_the_create_login_details() {
		ep.checkbox();
	}

	@When("Admin input username")
	public void admin_input_username() {
		ep.userNameInput2("tester13");
	}

	@When("Admin input password")
	public void admin_input_password() {
		ep.passwordInput2("password1");
	}

	@When("Admin input confirm password")
	public void admin_input_confirm_password() {
		ep.confirmPassword2("password1");
	}

	@When("Admin clicks save button")
	public void admin_clicks_save_button() {
		ep.saveButton();
	}

	@Then("the Employee should be added successfully")
	public void the_employee_should_be_added_successfully() {

	}
}
