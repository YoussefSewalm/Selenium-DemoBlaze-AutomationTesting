package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class PlaceOrderPage extends Utility{

	public PlaceOrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

        //By.id("totalm") -----Check total Price in PlaceOrderPage
	    //By.id("name")-----EnterName
	    //By.id("country")-----EnterCountry
    //By.id("city")-----EnterCity
    //By.id("card")-----EnterCreditCard
    //By.id("month")-----EnterMonth
    //By.id("year")-----EnterYear
    //By.cssSelector("button[onclick="purchaseOrder()"]")-----PurchaseButton
	//By.xpath("//div[@class="sweet-alert  showSweetAlert visible"]/h2")----Checkformessage "Thank you for your purchase!"
    //By.cssSelector("button[class="confirm btn btn-lg btn-primary"]")---Press Ok after Purchase and Return HOMEPAGE
	private By EnterName=By.id("name");
	private By EnterCountry=By.id("country");
	private By EnterCity=By.id("city");
	private By EnterCreditCard=By.id("card");
	private By EnterMonth=By.id("month");
	private By EnterYear=By.id("year");
	private By PurchaseButton=By.cssSelector("button[onclick=\"purchaseOrder()\"]");
	private By TotalPriceFromPlaceOrder=By.id("totalm");
	private By ThankYouMessage=By.xpath("//div[@class=\"sweet-alert  showSweetAlert visible\"]/h2");
	private By OkButtonAfterPurchase=By.cssSelector("button[class=\"confirm btn btn-lg btn-primary\"]");
	
	
	private WebElement EnterNameElement;
	private WebElement EnterCountryElement;
	private WebElement EnterCityElement;
	private WebElement EnterCreditCardElement;
	private WebElement EnterMonthElement;
	private WebElement EnterYearElement;
	private WebElement PurchaseButtonElement;
	private WebElement OkButtonAfterPurchaseElement;
	
	
	public HomePageAllProducts ClickingOkAfterPurchase()
	{
		OkButtonAfterPurchaseElement=driver.findElement(OkButtonAfterPurchase);
		Clicking(OkButtonAfterPurchaseElement);
		return new HomePageAllProducts(driver);
	}
	public void EnteringName(String name)
	{
		EnterNameElement=driver.findElement(EnterName);
		SendText(EnterNameElement,name);
	}
	public void EnteringCountry(String country)
	{
		EnterCountryElement=driver.findElement(EnterCountry);
		SendText(EnterCountryElement,country);
	}
	public void EnteringCity(String city)
	{
		EnterCityElement=driver.findElement(EnterCity);
		SendText(EnterCityElement,city);
	}
	public void EnterCreditCard(String creditcard)
	{
		EnterCreditCardElement=driver.findElement(EnterCreditCard);
		SendText(EnterCreditCardElement,creditcard);
	}
	public void EnterMonth(String month)
	{
		EnterMonthElement=driver.findElement(EnterMonth);
		SendText(EnterMonthElement,month);
	}
	public void EnterYear(String year)
	{
		EnterYearElement=driver.findElement(EnterYear);
		SendText(EnterYearElement,year);
	}
	public void ClickingPurchase()
	{
		PurchaseButtonElement=driver.findElement(PurchaseButton);
		Clicking(PurchaseButtonElement);
	}
	public void CheckingTotalPriceInPlaceOrder()
	{
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(TotalPriceFromPlaceOrder)));
		Assert.assertTrue(driver.findElement(TotalPriceFromPlaceOrder).getText().contains("1180"));
	}
	public void FillingPlaceOrderInfo(String name,String country,String city,String creditcard,String month,String year)
	{
		EnteringName(name);
		EnteringCountry(country);
		EnteringCity(city);
		EnterCreditCard(creditcard);
		EnterMonth(month);
		EnterYear(year);
	}
	public void VerifyingPlacingOrder()
	{
		Assert.assertTrue(driver.findElement(ThankYouMessage).getText().contains("Thank"));
	}
}
