package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends Utility {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By EnterLoginUserName=By.cssSelector("input[id=\"loginusername\"]");
	private By EnterLoginPassword=By.cssSelector("input[id=\"loginpassword\"]");
	private By LoginButton=By.cssSelector("button[onclick=\"logIn()\"]");
	private By CloseButton=By.xpath("(//button[@class=\"btn btn-secondary\"])[3]");
	
	private WebElement EnterLoginUserNameElement;
	private WebElement EnterLoginPasswordElement;
	private WebElement LoginButtonElement;
	private WebElement CloseButtonElement;
	
	public void EnterLoginUserName(String loginemail)
	{
		EnterLoginUserNameElement=driver.findElement(EnterLoginUserName);
		SendText(EnterLoginUserNameElement,loginemail);
	}
	public void EnterLoginPassword(String loginpassword)
	{
		EnterLoginPasswordElement=driver.findElement(EnterLoginPassword);
		SendText(EnterLoginPasswordElement,loginpassword);
	}
	public void ClearingLoginUserName()
	{
		EnterLoginUserNameElement=driver.findElement(EnterLoginUserName);
		ClearText(EnterLoginUserNameElement);

	}
	public void ClearingLoginPassword()
	{
		EnterLoginPasswordElement=driver.findElement(EnterLoginPassword);
		ClearText(EnterLoginPasswordElement);

	}
	public void ClickingLogin()
	{
		LoginButtonElement=driver.findElement(LoginButton);
		Clicking(LoginButtonElement);
	}
	public void ClickingClose()
	{
		CloseButtonElement=driver.findElement(CloseButton);
		Clicking(CloseButtonElement);
	}
	public void HandlingInvalidLoginAlert()
	{
		new WebDriverWait(driver, Duration.ofSeconds(60)).ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
		boolean expected_2=true;
		boolean actual_2=driver.switchTo().alert().getText().contains("Wrong");
		Assert.assertEquals(actual_2, expected_2);
		driver.switchTo().alert().accept();
	}
	public void HandlingValidLoginAlert_2()
	{
		new WebDriverWait(driver, Duration.ofSeconds(60)).ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
		boolean expected_3=true;
		boolean actual_3=driver.switchTo().alert().getText().contains("User");
		Assert.assertEquals(actual_3, expected_3);
		driver.switchTo().alert().accept();
	}
	public void VerifyingLogin()
	{
		WebElement WelcomeText=driver.findElement(By.id("nameofuser"));
		boolean expected_1=true;
		boolean actual_1=WelcomeText.getText().contains("Welcome");
		Assert.assertEquals(actual_1, expected_1);
	}


}
