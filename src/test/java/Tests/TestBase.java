package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Pages.DriverInitiator;

public class TestBase extends DriverInitiator {
	
@BeforeSuite(alwaysRun=true)
public void startSession()
	{
		DriverInitiator.StartSession();
	}
public static synchronized WebDriver getDriver() 
        {
                return driver;
        }
	
@AfterSuite(alwaysRun=true)
public void endSession()
	{
		DriverInitiator.EndSession();
	}

}
