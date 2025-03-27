package coreElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import Listeners.TestListener;

public class Texts extends Elements{

	public Texts(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	
	public String GetText()
	{
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);
		
		wait.until(
				d -> {
				   driver.findElement(byLocator).isDisplayed();
				   return true;
		         	});
		String Text = driver.findElement(byLocator).getText();
		return Text;
	}
	public Boolean VerifyTextContains(String Text)
	{
		Boolean Text_Contains = driver.findElement(byLocator).getText().contains(Text);
		return Text_Contains;
	}
	public void assertTextEquals(String actualText, String expectedText) {
	    try {
	        Assert.assertEquals(actualText, expectedText, 
	                "Expected: \"" + expectedText + "\", but found: \"" + actualText + "\"");
	        TestListener.saveScreenshotPNG(driver,byLocator); 
	    } catch (AssertionError e) {
	    	TestListener.saveScreenshotPNG(driver, byLocator);
	        throw e;
	    }
	}

	public void assertTextContains( String expectedSubstring) {
	    String actualText = driver.findElement(byLocator).getText();
	    try {
	        Assert.assertTrue(actualText.contains(expectedSubstring),
	                "Expected text to contain: \"" + expectedSubstring + "\" but not found:\"");
	        TestListener.saveScreenshotPNG(driver,byLocator);
	    } catch (AssertionError e) {
	    	TestListener.saveScreenshotPNG(driver,byLocator);
	        throw e;
	    }
	}

}
