package Tests;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Listeners.TestListener;
import coreElements.*;

import static ExtentReports.ExtentTestManager.startTest;
import static Pages.P0_Home.*;
import static Pages.P5_SignUp.*;

import java.lang.reflect.Method;

@Listeners({ TestListener.class })
public class SignUp extends TestBase {
	Faker faker = new Faker();

	@Test(groups = {"Smoke"})
	public void ValidSignUp(Method method) throws InterruptedException
	{
                startTest(method.getName(), "Valid SignUp");
                SignUp.Navigate();
		SignUpUserName.sendText(faker.name().username());
		SignUpPassword.sendText(faker.number().toString());
		ConfirmSignUp.Click();
		Assert.assertTrue(Alerts.GetAlertText().contains("Sign up successful."));
		Alerts.ConfirmAlert();
	}
	@Test(groups = {"Regression"})
	public void InValidSignUp(Method method) throws InterruptedException
	{
                startTest(method.getName(), "InValid SignUp");
		SignUp.Navigate();
		SignUpUserName.sendText("");
		SignUpPassword.sendText(faker.number().toString());
		ConfirmSignUp.Click();
		Assert.assertTrue(Alerts.GetAlertText().contains("Please fill out Username and Password."));
		Alerts.ConfirmAlert();
		Thread.sleep(600);
		CloseSignUpMenu.Click();
	}
}
