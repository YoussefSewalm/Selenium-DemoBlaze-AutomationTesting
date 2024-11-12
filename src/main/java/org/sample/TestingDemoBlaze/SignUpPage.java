package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends Utility {

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By EnterSignUpUsername=By.id("sign-username");
	private By EnterSignUpPassword=By.id("sign-password");
	private By SignUpButton=By.cssSelector("button[onclick=\"register()\"]");
	private By CloseButton=By.xpath("(//button[@class=\"btn btn-secondary\"])[2]");

	
	private WebElement EnterSignUpUsernameElement;
	private WebElement EnterSignUpPasswordElement;
	private WebElement SignUpButtonElement;
	private WebElement CloseButtonElement;

	
	public void EnteringSignUpUserName(String username)
	{
		EnterSignUpUsernameElement=driver.findElement(EnterSignUpUsername);
		SendText(EnterSignUpUsernameElement,username);
	}
	public void EnteringSignUpPassword(String pw)
	{
		EnterSignUpPasswordElement=driver.findElement(EnterSignUpPassword);
		SendText(EnterSignUpPasswordElement,pw);
	}
	public void ClickingSignUp()
	{
		SignUpButtonElement=driver.findElement(SignUpButton);
		Clicking(SignUpButtonElement);
	}	
	public void ClearingSignUpUserName()
	{
		EnterSignUpUsernameElement=driver.findElement(EnterSignUpUsername);
		ClearText(EnterSignUpUsernameElement);
	}
	public void ClearingSignUpPassword()
	{
		EnterSignUpPasswordElement=driver.findElement(EnterSignUpPassword);
		ClearText(EnterSignUpPasswordElement);
	}

	public void ClickingClose()
	{
		CloseButtonElement=driver.findElement(CloseButton);
		Clicking(CloseButtonElement);
	}
	public void HandlingSingUpAlert_1()
	{
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		boolean expected_5=true;
		boolean actual_5=driver.switchTo().alert().getText().contains("successful");
		Assert.assertEquals(actual_5, expected_5);
		driver.switchTo().alert().accept();
	}
	public void HandlingSignUpAlert_2()
	{
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		boolean expected_4=true;
	    boolean actual_4=driver.switchTo().alert().getText().contains("already");
		Assert.assertEquals(actual_4, expected_4);
		driver.switchTo().alert().accept();
	}


}
