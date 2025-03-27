package coreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {
	
    By byLocator;
	static WebDriver driver;
	
	public Elements(By Locator) {
		byLocator=Locator;
	}
	
	public static void setDriver(WebDriver driver_1)
	{
		driver=driver_1;
	}

}
