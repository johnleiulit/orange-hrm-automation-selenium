package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.EmergencyContactsPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmergencyContactsTestCase extends Library{
	EmergencyContactsPage ecp;
	SeleniumReusable se;
	@When("Admin clicks emergency contacts on the sidebar")
	public void admin_clicks_emergency_contacts_on_the_sidebar() throws InterruptedException {
		ecp = new EmergencyContactsPage(driver);
		ecp.emergencyContacts();
		Thread.sleep(5000);
	}
	
	@Then("Admin should be navigated to emergency contacts")
	public void admin_should_be_navigated_to_emergency_contacts() {
	    ecp.emergencyContactsPage();
	}

	@When("Admin click add button")
	public void admin_click_add_button() {
	    ecp.addButton();
	}

	@When("Admin enters name")
	public void admin_enters_name() {
	    ecp.nameInput("Lei");
	}

	@When("Admin enters relationship")
	public void admin_enters_relationship() {
	    ecp.relationshipInput("Parent");
	}

	@When("Admin enters home telephone")
	public void admin_enters_home_telephone() {
		ecp.homeTelephoneInput("02 8123 4567");
	}

	@When("Admin enters work telephone")
	public void admin_enters_work_telephone() {
		ecp.workTelephoneInput("043 980 1122");
	}

	@Then("It should show successsfully updated")
	public void it_should_show_successsfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/emergencyContacts.png");
		
	}

}
