package Tests;

import static ExtentReports.ExtentTestManager.startTest;
import static Pages.P0_Home.*;
import static Pages.P1_ProductDetails.*;
import static Pages.P2_Cart.*;
import static Pages.P3_PlaceOrder.*;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Listeners.TestListener;
import coreElements.Alerts;

@Listeners({ TestListener.class })
public class PlacingOrder extends TestBase{
	Faker faker = new Faker();

	@Test(groups= {"Smoke"})
	public void ValidPlacingOrder(Method method) throws InterruptedException
	{
        startTest(method.getName(), "Valid Placing Order");
        HomePage.Navigate();
        FirstPhone.Navigate();
        AddToCart.Navigate();
        Alerts.ConfirmAlert();
        HomePage.Navigate();
        SecondPhone.Navigate();
        AddToCart.Navigate();
        Alerts.ConfirmAlert();
        Cart.Navigate();
        PlaceOrder.Click();
        Name.sendText(faker.name().firstName());
        Country.sendText(faker.country().name());
        City.sendText(faker.country().capital());
        CreditCard.sendText(faker.finance().creditCard());
        Month.sendText(Integer.toString(faker.number().numberBetween(1, 12)));
        Year.sendText(Integer.toString(faker.number().numberBetween(1999, 2025)));
        Purchase.Click();
        VerifyPlacingOrder.assertTextContains("Thank you");
        Thread.sleep(500);
        Ok.Click();
	}
	@Test(groups= {"Regression"})
	public void InValidPlacingOrder(Method method) throws InterruptedException
	{
        startTest(method.getName(), "InValid Placing Order");
        HomePage.Navigate();
	FirstPhone.Navigate();
        AddToCart.Navigate();
        Alerts.ConfirmAlert();
        HomePage.Navigate();
        SecondPhone.Navigate();
        AddToCart.Navigate();
        Alerts.ConfirmAlert();
        Cart.Navigate();
        PlaceOrder.Click();
        Name.sendText("");
        Country.sendText(faker.country().name());
        City.sendText(faker.country().capital());
        CreditCard.sendText("");
        Month.sendText(Integer.toString(faker.number().numberBetween(1, 12)));
        Year.sendText(Integer.toString(faker.number().numberBetween(1999, 2025)));
        Purchase.Click();
        Assert.assertTrue(Alerts.GetAlertText().contains("Please fill out"));
        Alerts.ConfirmAlert();
        Close.Click();
	}

}
