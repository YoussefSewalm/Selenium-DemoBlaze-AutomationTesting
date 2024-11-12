package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ValidSignUp extends TestBase {
	
	HomePageAllProducts homepage;
	SignUpPage signuppage;
	
	
	@Test
	public void ValidSignUpTC()
	{
		homepage=new HomePageAllProducts(driver);
		signuppage=homepage.ClickingSignUp();
		WebElement Signuptext=driver.findElement(By.id("signInModalLabel"));
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Signuptext));
		signuppage.ClearingSignUpUserName();
		signuppage.ClearingSignUpPassword();
		signuppage.EnteringSignUpUserName("7amada1009");
		signuppage.EnteringSignUpPassword("12345678");
		signuppage.ClickingSignUp();
        signuppage.HandlingSingUpAlert_1();
	}
	

}
