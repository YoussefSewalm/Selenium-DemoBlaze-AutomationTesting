package Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners.TestListener;
import coreElements.*;
import static ExtentReports.ExtentTestManager.*;
import static Pages.P0_Home.*;
import static Pages.P1_ProductDetails.*;
import static Pages.P2_Cart.*;

import java.lang.reflect.Method;

@Listeners({ TestListener.class })
public class Cart extends TestBase
{
	@Test(groups= {"Regression"})
	public void VerifyCartPrices (Method method)
	{
                startTest(method.getName(), "Verify Cart Prices");
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
                Cart.Navigate();
                FirstPhonePriceFromCart.assertTextEquals(Actual_FirstPhonePrice.substring(1),Utility.GetProductPriceFromCart(Actual_FirstPhoneName));
                SecondPhonePriceFromCart.assertTextEquals(Actual_SecondPhonePrice.substring(1),Utility.GetProductPriceFromCart(Actual_SecondPhoneName));
                TotalPriceFromCart.assertTextEquals(Utility.GetActualTotalCartPrice(), Utility.CalculateTotalPriceFromCart());
	}
	@Test(groups= {"Smoke"})
	public void VerifyRemovingItemsFromCart(Method method) throws InterruptedException
	{
                startTest(method.getName(), "Verify Removing Items From Cart");
                HomePage.Navigate();
		FirstPhone.Navigate();
                AddToCart.Navigate();
                Alerts.ConfirmAlert();
                HomePage.Navigate();
                SecondPhone.Navigate();
                AddToCart.Navigate();
                Alerts.ConfirmAlert();
                Cart.Navigate();
                Utility.RemoveAllProductsFromCart();
                Thread.sleep(1000);
                TotalPriceFromCart.assertTextContains("");
	}
}
