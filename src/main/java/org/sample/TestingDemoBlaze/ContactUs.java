package org.sample.TestingDemoBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs extends Utility {

	public ContactUs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By EnterContactEmail=By.id("recipient-email");
	private By EnterContactName=By.id("recipient-name");
	private By EnterContactMessage=By.id("message-text");
	private By ContactMessageButton=By.cssSelector("button[onclick=\"send()\"]");
	
	private WebElement EnterContactEmailElement;
	private WebElement EnterContactNameElement;
	private WebElement EnterContactMessageElement;
	private WebElement ContactMessageButtonElement;

	public void EnteringContactUsEmail(String email)
	{
		EnterContactEmailElement=driver.findElement(EnterContactEmail);
		SendText(EnterContactEmailElement,email);
	}
	public void EnteringContactUsName(String name)
	{
		EnterContactNameElement=driver.findElement(EnterContactName);
		SendText(EnterContactNameElement,name);
	}
	public void EnteringContactUsMessage(String message)
	{
		EnterContactMessageElement=driver.findElement(EnterContactMessage);
		SendText(EnterContactMessageElement,message);
	}
	public void SubmittingContactUsMessage()
	{
		ContactMessageButtonElement=driver.findElement(ContactMessageButton);
		Clicking(ContactMessageButtonElement);
		driver.switchTo().alert().accept();
	}
	public void FillingContactUsInfo(String email,String name,String message)
	{
		EnteringContactUsEmail(email);
		EnteringContactUsName(name);
		EnteringContactUsMessage(message);
	}
}
