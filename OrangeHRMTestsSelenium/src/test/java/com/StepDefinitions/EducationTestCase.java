package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.EducationPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EducationTestCase extends Library {
	EducationPage ep;
	SeleniumReusable se;
	@When("Admin clicks add button on education")
	public void admin_clicks_add_button_on_education() {
		ep = new EducationPage(driver);
		ep.addButton();
	}

	@When("Admin enters level on education")
	public void admin_enters_level_on_education() {
		ep.levelInput("Bachelor's Degree");
	}

	@When("Admin enters institute on education")
	public void admin_enters_institute_on_education() {
		ep.instituteInput("University of the Philippines");
	}

	@When("Admin enters major\\/specialization on education")
	public void admin_enters_major_specialization_on_education() {
		ep.majorInput("Computer Science");
	}

	@When("Admin enters year on education")
	public void admin_enters_year_on_education() {
		ep.yearInput("4");
	}

	@When("Admin enters gpa\\/score on education")
	public void admin_enters_gpa_score_on_education() {
		ep.gpaInput("92");
	}

	@When("Admin enters start date on education")
	public void admin_enters_start_date_on_education() {
		ep.startDateInput("2022-21-08");
	}

	@When("Admin enters end date on education")
	public void admin_enters_end_date_on_education() {
		ep.endDateInput("2026-03-05");
	}

	@When("Admin clicks save button on education")
	public void admin_clicks_save_button_on_education() {
		ep.saveButton(null);
	}

	@Then("It should show education successfully updated")
	public void it_should_show_education_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/education.png");
	}
}
