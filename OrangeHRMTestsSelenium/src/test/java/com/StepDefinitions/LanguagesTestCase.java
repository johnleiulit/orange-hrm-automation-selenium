package com.StepDefinitions;

import com.Baseclass.Library;
import com.Pages.LanguagesPage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguagesTestCase extends Library {
	LanguagesPage lp;
	SeleniumReusable se;

	@When("Admin clicks add button on langauges")
	public void admin_clicks_add_button_on_langauges() {
		lp = new LanguagesPage(driver);
		lp.addButton();
	}

	@When("Admin enters language")
	public void admin_enters_language() {
		lp.languageInput("English");
	}

	@When("Admin enters fluency on language")
	public void admin_enters_fluency_on_language() {
		lp.fluencyInput("Writing");
	}

	@When("Admin enters competency on language")
	public void admin_enters_competency_on_language() {
		lp.competencyInput("Good");
	}

	@When("Admin enters comments on language")
	public void admin_enters_comments_on_language() {
		lp.commentsInput("Maintains technical documentation and client email correspondence.");
	}

	@When("Admin clicks save button on language")
	public void admin_clicks_save_button_on_language() {
		lp.saveButton();
	}

	@Then("It should show language successfully updated")
	public void it_should_show_language_successfully_updated() throws InterruptedException {
		se = new SeleniumReusable(driver);
		Thread.sleep(5000);
		se.screenShot("src/test/resources/Screenshot/languages.png");
	}

}
