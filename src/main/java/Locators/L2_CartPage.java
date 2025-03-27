package Locators;

import org.openqa.selenium.By;

public class L2_CartPage {
	
	//Texts
	public static By TotalPriceFromCartText = By.id("totalp");
	public static By FirstPhonePriceFromCartText = By.xpath("//td[contains(text(),'Samsung')]/following-sibling::td[1]");
	public static By SecondPhonePriceFromCartText = By.xpath("//td[contains(text(),'Nokia')]/following-sibling::td[1]");
	
	//Buttons
	public static By PlaceOrderButton = By.xpath("//button[contains(text(),'Place Order')]");

}
