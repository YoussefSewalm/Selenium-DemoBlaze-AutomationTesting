package Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import coreElements.Elements;

public class DriverInitiator {
	
	public static WebDriver driver;

	public static void StartSession()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-features=SidePanelPinning");
        driver = new ChromeDriver(options);
	    Elements.setDriver(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.navigate().to("https://www.demoblaze.com/");
        String Actual_Title = driver.getTitle();
	    Assert.assertEquals(Actual_Title,"STORE");
	}
    public static synchronized WebDriver getDriver() {
        return driver;
    }
	
	public static void EndSession()
	{
       driver.quit();
	}

}
