package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ValidLogin extends TestBase {
	
	LoginPage loginpage;
	HomePageAllProducts homepage;
	
	@Test
	public void ValidLoginTC()
	{
		homepage=new HomePageAllProducts(driver);
		loginpage=homepage.ClickingLogin();
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logInModalLabel"))));
		loginpage.ClearingLoginUserName();
		loginpage.ClearingLoginPassword();
		loginpage.EnterLoginUserName("ahmed20");
		loginpage.EnterLoginPassword("12345678");
        loginpage.ClickingLogin();
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("logInModalLabel"))));
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nameofuser"))));
        loginpage.VerifyingLogin();
		homepage.ClickingLogout();
	}

}
