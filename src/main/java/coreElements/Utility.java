package coreElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends Elements {

	public Utility(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	
	public static String GetProductPriceFromCart(String ProductName)
	{
		By CartPrices = By.xpath("//td[contains(text(),'"+ProductName+"')]/following-sibling::td[1]");
		String Price = driver.findElement(CartPrices).getText();
		return Price;
	}
	public static String GetActualTotalCartPrice()
	{
		By CartPrices = By.id("totalp");
		String Price = driver.findElement(CartPrices).getText();
		return Price;
	}
	
	public static void RemoveProductFromCart(String ProductName)
	{
		By CartItems = By.xpath("//td[contains(text(),'"+ProductName+"')]/following-sibling::td[2]");
		driver.findElement(CartItems).click();
	}
	public static void RemoveAllProductsFromCart()
	{
		By CartItems = By.xpath("//a[contains(text(),'Delete')]");
		List<WebElement> AllCartItems = driver.findElements(CartItems);
		int NumberOfItems = AllCartItems.size();
		for(int i = 0 ; i < NumberOfItems ; i++ )
		{
			driver.findElements(CartItems).get(i).click();
		}
	}
	public static String CalculateTotalPriceFromCart()
	{
		By CartPrices = By.xpath("//tr[@class=\"success\"]/td[3]");
		List<WebElement> AllCartPrices = driver.findElements(CartPrices);
		int NumberOfItems = AllCartPrices.size();
		Integer TotalPrice = 0;
		for(int i = 0 ; i < NumberOfItems ; i++ )
		{
			String Price = driver.findElements(CartPrices).get(i).getText();
			TotalPrice += Integer.parseInt(Price);
		}
		String TotalPriceString = Integer.toString(TotalPrice);
		return TotalPriceString;
	}

}
