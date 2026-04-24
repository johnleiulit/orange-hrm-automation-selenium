package com.ReusableFunctions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.Library;

public class SeleniumReusable extends Library{
	
	public SeleniumReusable(WebDriver driver) {
		this.driver = driver;
		this.logger = Logger.getLogger(SeleniumReusable.class);
	}
	
	public void enterValue(WebElement element, String text) {
		try {
			element.sendKeys(text);
			logger.info("===== Entered Value =====");
		}catch (Exception e) {
			System.out.println("No such element Exception");
		}
	}
	
	public void click(WebElement element) {
		try {
			element.click();
			logger.info("===== Clicked Button =====");
		} catch (Exception e) {
			System.out.println("No such element Exception");
		}
	}
	
	public void getTitle() {
		try {
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			System.out.println("Couldn't get the Title");
		}
	}
	
	public void selectDropdown(WebElement element, String value) {
	    click(element);
	    driver.findElement(By.xpath("//span[text()=\"" + value + "\"]")).click();
	}
	
	
	
	public void dropDown(WebElement element, String text) {
		Select drp = new Select(element);
		drp.selectByValue(text);
	}
	
	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	}
	
	public void waits() throws InterruptedException{
		Thread.sleep(2000);
	}
	
	public void screenShot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File(path));
		} catch (Exception e) {
			System.out.println("Couldn't take screenshot");
		}
	}

	public void clearValue(WebElement element) {
	    try {
	        element.click();
	        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	        element.sendKeys(Keys.DELETE);
	        logger.info("====== Cleared Value =======");
	    } catch (Exception e) {
	        System.out.println("No such element Exception");
	    }
	}
}
