package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.ReportToPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RerpotToTestCase extends Library {
	ReportToPage rtp;
	SeleniumReusable se;

	@When("Admin clicks report-to on the sidebar")
	public void admin_clicks_report_to_on_the_sidebar() {
		rtp = new ReportToPage(driver);
		rtp.reportTo();
	}

	@Then("should be navigated to report to page")
	public void should_be_navigated_to_report_to_page() { 
		rtp.reportToPage();
	}

	@When("Admin clicks add button on report")
	public void admin_clicks_add_button_on_report() {
		rtp.addButton();
	}

	@When("Admin enters name supervisor")
	public void admin_enters_name_supervisor() throws InterruptedException {
		rtp.nameInput("J", "James Butler");
	}

	@When("Admin enters reporting method on report")
	public void admin_enters_reporting_method_on_report() {
		rtp.reportingMethodInput("Test_Reporting");
	}

	@When("Admin clicks save button on report")
	public void admin_clicks_save_button_on_report() {
		rtp.saveButton();
	}

	@Then("It should show report to successfully updated")
	public void it_should_show_report_to_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/reportTo.png");
	}

}
