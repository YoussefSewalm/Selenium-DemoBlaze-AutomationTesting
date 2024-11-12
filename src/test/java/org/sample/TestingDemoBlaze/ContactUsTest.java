package org.sample.TestingDemoBlaze;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
	
	HomePageAllProducts homepage;
	ContactUs contactus;
	
	@DataProvider(name="ContactUsInformation")
	public String [][] ContactUsInfo() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadContactUsData();
	}
	@Test(dataProvider="ContactUsInformation")
	public void CheckingContactUs(String email,String name,String message)
	{
		homepage=new HomePageAllProducts(driver);
		contactus=homepage.ClickingContactUs();
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("exampleModalLabel"))));
		contactus.FillingContactUsInfo(email, name , message);
		contactus.SubmittingContactUsMessage();
	}
	
}
