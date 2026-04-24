package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.FilteringPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilteringTestCase extends Library {
	FilteringPage fp;
	SeleniumReusable se;

	@When("Admin enters employee name")
	public void admin_enters_employee_name() {
		fp = new FilteringPage(driver);
		se = new SeleniumReusable(driver);
		fp.employeeNameInput("John Lei", "John Lei Test Tester");

	}

	@When("Admin clicks search button")
	public void admin_clicks_search_button() throws InterruptedException {
		fp.searchButton();
	}

	@Then("It should display the filtered results by employee name")
	public void it_should_display_the_filtered_results_by_employee_name() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/Filtering/employeeName.png");
	}

	@Then("Admin clicks reset button")
	public void admin_clicks_reset_button() {
		fp.resetButton();
	}

	@Then("All filter fields should be cleared")
	public void all_filter_fields_should_be_cleared() {
		fp.tableCleared();
	}

	@When("Admin enters employee id")
	public void admin_enters_employee_id() {
		fp.employeeIdInput("0111");
	}

	@Then("It should display the filtered results by employee id")
	public void it_should_display_the_filtered_results_by_employee_id() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.waits();
		se.screenShot("src/test/resources/Screenshot/Filtering/employeeId.png");
	}

	@When("Admin selects employment status")
	public void admin_enters_employment_status() {
		fp.employmentStatusInput("Full-Time Contract");
	}

	@Then("It should display the filtered results by employment status")
	public void it_should_display_the_filtered_results_by_employment_status() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.waits();
		se.screenShot("src/test/resources/Screenshot/Filtering/employmentStatus.png");
	}

	@When("Admin selects include")
	public void admin_enters_include() {
		fp.includeInput("Current and Past Employees");
	}

	@Then("It should display the filtered results by include")
	public void it_should_display_the_filtered_results_by_include() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.waits();
		se.screenShot("src/test/resources/Screenshot/Filtering/include.png");
	}

	@When("Admin enters supervisor name")
	public void admin_enters_supervisor_name() {
		fp.supervisorNameInput("J", "James Butler");
	}

	@Then("It should display the filtered results by supervisor name")
	public void it_should_display_the_filtered_results_by_supervisor_name() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/Filtering/supervisorName.png");

	}

	@When("Admin selects job title")
	public void admin_selects_job_title() {
		fp.jobTitleInput("Automaton Tester");
	}

	@Then("It should display the filtered results by job title")
	public void it_should_display_the_filtered_results_by_job_title() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/Filtering/jobTitle.png");

	}

	@When("Admin selects sub unit")
	public void admin_selects_sub_unit() {
		fp.subUnitInput("Quality Assurance");
	}

	@Then("It should display the filtered results by sub unit")
	public void it_should_display_the_filtered_results_by_sub_unit() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/Filtering/subUnit.png");
	}
	@When("Admin fills all filter fields")
	public void admin_fills_all_filter_fields() {
		fp.allFields(
		        "John", "John Lei Test Tester",
		        "0111",
		        "Full-Time Contract",
		        "Current and Past Employees",
		        "J", "James Butler",
		        "Automaton Tester",
		        "Quality Assurance"
		    );
	}
	
	@Then("It should display the filtered results using all applied filters")
	public void it_should_display_the_filtered_results_using_all_applied_filters() throws InterruptedException {
		fp.tableResult();
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/Filtering/allFields.png");

	}

}
