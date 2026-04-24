package com.Hooks;

import java.io.IOException;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends Library{
	SeleniumReusable se;
	public static Scenario scenario ;
	
	@Before
	public void test(Scenario Cucumberscenario ) throws IOException {
		scenario = Cucumberscenario ;
		launchApp();
	}
	
	@After
	public void cleanUp(Scenario scenario) throws InterruptedException {
		se = new SeleniumReusable(driver);
		
//		if (driver != null) {
//			driver.quit();
//			System.out.println("Browser closed");
//		}
	}
	

}
