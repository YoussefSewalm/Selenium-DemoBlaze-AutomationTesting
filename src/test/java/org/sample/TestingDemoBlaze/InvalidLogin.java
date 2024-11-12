package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InvalidLogin extends TestBase {
	
	
	LoginPage loginpage;
	HomePageAllProducts homepage;
	
	@Test(dependsOnMethods="InvalidLoginUsingWrongPass")
	public void InvalidLoginUsingWrongUsername()
	{
		homepage=new HomePageAllProducts(driver);
		loginpage=homepage.ClickingLogin();
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logInModalLabel"))));
		loginpage.ClearingLoginUserName();
		loginpage.ClearingLoginPassword();
		loginpage.EnterLoginUserName("ahmed201");
		loginpage.EnterLoginPassword("12345678");
	    loginpage.ClickingLogin();
		loginpage.HandlingValidLoginAlert_2();
		loginpage.ClickingClose();
	}
	
	@Test(priority=1)
	public void InvalidLoginUsingWrongPass()
	{
		homepage=new HomePageAllProducts(driver);
		loginpage=homepage.ClickingLogin();
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logInModalLabel"))));
		loginpage.ClearingLoginUserName();
		loginpage.ClearingLoginPassword();
		loginpage.EnterLoginUserName("ahmed10");
		loginpage.EnterLoginPassword("1234567844");
	    loginpage.ClickingLogin();
		loginpage.HandlingInvalidLoginAlert();
		loginpage.ClickingClose();
	}
	
	

}
