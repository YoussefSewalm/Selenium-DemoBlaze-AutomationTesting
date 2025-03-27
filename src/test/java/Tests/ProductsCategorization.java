package Tests;

import static ExtentReports.ExtentTestManager.startTest;
import static Pages.P0_Home.*;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners.TestListener;

@Listeners({ TestListener.class })
public class ProductsCategorization extends TestBase {
	
	@Test(groups= {"Smoke"})
	public void VerifyProductsCategorization(Method method)
	{
		HomePage.Navigate();
                startTest(method.getName(), "Verify Products Categorization");
		Phones.Navigate();
		FirstPhoneArticle.assertTextContains("phone");
		Laptops.Navigate();
		FirstLaptopArticle.assertTextContains("laptop");
		Monitors.Navigate();
		FirstMonitorArticle.assertTextContains("LCD");
		Phones.Navigate();
	}
}
