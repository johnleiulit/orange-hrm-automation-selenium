package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.JobDetailsPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobDetailsTestCase extends Library {
	JobDetailsPage jdp;
	SeleniumReusable se;

	@When("Admin clicks job on the sidebar")
	public void admin_clicks_job_on_the_sidebar() {
		jdp = new JobDetailsPage(driver);
		jdp.job();
	}

	@Then("should be navigated to job page")
	public void should_be_navigated_to_job_page() {
		jdp.jobPage();
	}

	@When("Admin enters joined date on job details")
	public void admin_enters_joined_date_on_job_details() {
		jdp.joinedDateInput("2026-04-19");
	}

	@When("Admin enters job title on job details")
	public void admin_enters_job_title_on_job_details() throws InterruptedException {
		jdp.jobTitleInput("Automaton Tester");
	}

	@When("Admin enters job category on job details")
	public void admin_enters_job_category_on_job_details() {
		jdp.jobCategoryInput("Professionals");
	}

	@When("Admin enters sub unit on job details")
	public void admin_enters_sub_unit_on_job_details() {
		jdp.subUnitInput("Quality Assurance");
	}

	@When("Admin enters location on job details")
	public void admin_enters_location_on_job_details() {
		jdp.locationInput("New York Sales Office");
	}

	@When("Admin enters employments status on job details")
	public void admin_enters_employments_status_on_job_details() {
		jdp.employmentStatusInput("Full-Time Contract");
	}

	@When("Admin enable include employment contract details")
	public void admin_enable_include_employment_contract_details() {
		jdp.enableContractDetails();
	}

	@When("Admin enters contract start date on job details")
	public void admin_enters_contract_start_date_on_job_details() {
		jdp.contractStartDateInput("2026-21-04");
	}

	@When("Admin enters contract end date on job details")
	public void admin_enters_contract_end_date_on_job_details() {
		jdp.contractEndDateInput("2027-21-04");
	}

	@Then("It should show job details successfully updated")
	public void it_should_show_job_details_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/jobDetails.png");
	}

}
