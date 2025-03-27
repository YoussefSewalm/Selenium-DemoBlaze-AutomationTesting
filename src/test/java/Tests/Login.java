package Tests;

import static ExtentReports.ExtentTestManager.startTest;
import static JSONParsing.JSONDataDriven.getJsonData;
import static Pages.P0_Home.*;
import static Pages.P4_Login.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners.TestListener;
import coreElements.Alerts;

@Listeners({ TestListener.class })
public class Login extends TestBase{
	@DataProvider
	public Object[][] getLoginData() throws IOException 
	{
	        String jsonFilePath = System.getProperty("user.dir") + "//src//test//resources//testDataFiles//LoginData.json";
	        List<HashMap<String,String>> data = getJsonData(jsonFilePath);
	        return new Object[][] {   { data.get(0) }   } ;
	}
	
	@Test(dataProvider="getLoginData",groups= {"Smoke"})
	public void ValidLogin(HashMap<String,String>input,Method method)
	{
                startTest(method.getName(), "Valid Login");
		Login.Navigate();
		LoginUserName.sendText(input.get("LoginUserName"));
		LoginPassword.sendText(input.get("LoginPassword"));
		ConfirmLogin.Click();
		VerifyLoginSuccessfully.assertTextContains("Welcome");
		LogOut.Navigate();
	}
	@Test(groups= {"Regression"})
	public void InValidLogin(Method method) throws InterruptedException
	{
                startTest(method.getName(), "InValid Login");
		Login.Navigate();
		LoginUserName.sendText("");
		LoginPassword.sendText("");
		ConfirmLogin.Click();
		Assert.assertTrue(Alerts.GetAlertText().contains("Please fill out"));
		Alerts.ConfirmAlert();
		Thread.sleep(500);
		CloseLoginMenu.Click();
	}
}
