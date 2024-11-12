package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

/**
 * Unit test for simple App.
 */

public class TestBase
{
	public static WebDriver driver;


	@BeforeTest
	public void Setup()
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}
	 
	
	
	@AfterSuite
	public void Quit()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
	}

}
