package Locators;

import org.openqa.selenium.By;

public class L3_PlaceOrderPage {
	
	//Texts
	public static By VerifyTotalPriceText = By.id("totalm");
	public static By VerifyPlacingOrderText = By.xpath("//h2[contains(text(),'Thank you')]");

	//Buttons
	public static By PurchaseButton = By.xpath("//button[contains(text(),'Purchase')]");
	public static By CloseButton = By.xpath("//button[contains(text(),'Purchase')]/preceding-sibling::button");
	public static By OkButton = By.xpath("//button[contains(text(),'OK')]");
	
	//FormFields
	public static By NameFormField = By.id("name");
	public static By CountryFormField = By.id("country");
	public static By CityFormField = By.id("city");
	public static By CreditCardFormField = By.id("card");
	public static By MonthFormField = By.id("month");
	public static By YearFormField = By.id("year");
}
