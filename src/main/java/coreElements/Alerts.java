package coreElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Alerts extends Elements{

	public Alerts(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	
	public static void ConfirmAlert()
	{
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(NoAlertPresentException.class);
		
		wait.until(
				d -> {
				   driver.switchTo().alert();
				   return true;
		         	});
		
		driver.switchTo().alert().accept();
	}
	public static String GetAlertText()
	{
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(NoAlertPresentException.class);
		
		wait.until(
				d -> {
				   driver.switchTo().alert();
				   return true;
		         	});
		
		return driver.switchTo().alert().getText();
	}

}
