package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.SkillsPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SkillsTestCase extends Library {
	SkillsPage sp;
	SeleniumReusable se;

	@When("Admin clicks add button on skills")
	public void admin_clicks_add_button_on_skills() {
		sp = new SkillsPage(driver);
		sp.addButton();
	}

	@When("Admin enters skill add skill")
	public void admin_enters_skill_add_skill() {
		sp.skillInput("Java");
	}

	@When("Adnmin enters years of experience on skill")
	public void adnmin_enters_years_of_experience_on_skill() {
		sp.yearsExperienceInput("3");
	}

	@When("Admin enters comments on skill")
	public void admin_enters_comments_on_skill() {
		sp.commentsInput("Proficient in Selenium and Appium");
	}

	@When("Admin cliks save button on skill")
	public void admin_cliks_save_button_on_skill() {
		sp.saveButton();
	}

	@Then("It should show skill sucessfully updated")
	public void it_should_show_skill_sucessfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/skills.png");
	}

}
