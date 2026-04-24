package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/AddEmployeeFunctionality.feature", glue= {"com.StepDefinitions", "com.Hooks"},
				 plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags="@Regression")

public class runner extends AbstractTestNGCucumberTests {

}
	