package org.sample.TestingDemoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 */
public class Utility 
{
     protected WebDriver driver;
     
     public Utility (WebDriver driver) 
     {
    	 this.driver=driver;
     }
     
 	public static void Clicking(WebElement element)
 	{
 		element.click();
 	}
 	public static void SendText(WebElement element,String Text)
 	{
 		element.sendKeys(Text);
 	}
 	public static void ClearText(WebElement element)
 	{
 		element.clear();
 	}
 }

