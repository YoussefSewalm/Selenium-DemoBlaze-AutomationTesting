package Locators;

import org.openqa.selenium.By;

public class L1_ProductsDetailsPage {
	
	//Links
	public static By AddToCartLink = By.xpath("//a[contains(text(),'Add to cart')]");
	
	//Texts
	public static By PhoneNameFromProductDetailsText = By.cssSelector("h2[class=\"name\"]");
	public static By PhonePriceFromProductDetailsText = By.cssSelector("h3[class=\"price-container\"]");
}
