package Tests;

import static ExtentReports.ExtentTestManager.startTest;
import static Pages.P0_Home.*;
import static Pages.P1_ProductDetails.*;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners.TestListener;
import coreElements.Alerts;

@Listeners({ TestListener.class })
public class ProductDetails extends TestBase{
	@Test(groups= {"Regression"})
	public void VerifyProductDetails(Method method)
	{
    startTest(method.getName(), "Verify Product Details");
    HomePage.Navigate();
	String Actual_FirstPhoneName = FirstPhoneNameFromHome.GetText();
	String Actual_SecondPhoneName = SecondPhoneNameFromHome.GetText();
	String Actual_FirstPhonePrice = FirstPhonePriceFromHome.GetText();
	String Actual_SecondPhonePrice = SecondPhonePriceFromHome.GetText();
	FirstPhone.Navigate();
	PhoneNameFromProductDetails.assertTextContains(Actual_FirstPhoneName);
	PhonePriceFromProductDetails.assertTextContains(Actual_FirstPhonePrice);
    AddToCart.Navigate();
    Alerts.ConfirmAlert();
    HomePage.Navigate();
    SecondPhone.Navigate();
    PhoneNameFromProductDetails.assertTextContains(Actual_SecondPhoneName);
    PhonePriceFromProductDetails.assertTextContains(Actual_SecondPhonePrice);
    AddToCart.Navigate();
    Alerts.ConfirmAlert();
	}

}
