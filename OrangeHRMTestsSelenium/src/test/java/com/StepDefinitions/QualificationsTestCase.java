package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.QualificationsPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QualificationsTestCase extends Library {
	QualificationsPage qp;
	SeleniumReusable se;

	@When("Admin clicks qualifications on the sidebar")
	public void admin_clicks_qualifications_on_the_sidebar() {
		qp= new QualificationsPage(driver);
		qp.qualifications();
	}

	@Then("should be navigated to qualifications page")
	public void should_be_navigated_to_qualifications_page() {
		qp.qualificationsPage();
	}

	@When("Admin clicks add button on qualifications")
	public void admin_clicks_add_button_on_qualifications() {
		qp.addButton();
	}

	@When("Admin enters company on work experience")
	public void admin_enters_company_on_work_experience() {
		qp.companyInput("Google");
	}

	@When("Admin enters job title on work experience")
	public void admin_enters_job_title_on_work_experience() {
		qp.jobTitleInput("Quality Assurance Automation");
	}

	@When("Admin enters from date on work experience")
	public void admin_enters_from_date_on_work_experience() {
		qp.fromDateInput("2024-21-02");
	}

	@When("Admin enters to date on work experience")
	public void admin_enters_to_date_on_work_experience() {
		qp.toDateInput("2024-21-04");
	}

	@When("Admin enters comments on work experience")
	public void admin_enters_comments_on_work_experience() {
		qp.commentInput("Worked on automation testing");
	}

	@When("Admin clicks save button on work experience")
	public void admin_clicks_save_button_on_work_experience() {
		qp.saveButton();
	}

	@Then("It should show qualification successfully updated")
	public void it_should_show_qualification_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/qualifications.png");
	}

}
