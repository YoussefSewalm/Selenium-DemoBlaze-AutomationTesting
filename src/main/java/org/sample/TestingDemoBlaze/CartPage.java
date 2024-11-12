package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class CartPage extends Utility{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// div[class="panel-heading"]>h3---------Check Total Price GetText
	// //div[@class="table-responsive"]/table/tbody/tr[1]/td[3]----check price of 1st product in cart
	// //div[@class="table-responsive"]/table/tbody/tr[2]/td[3]---check price of 2nd product in cart
	// //div[@class="table-responsive"]/table/tbody/tr[1]/td[2]-----check name of 1st product in cart
	// //div[@class="table-responsive"]/table/tbody/tr[2]/td[2] ----check name of 2nd product in cart
	private By PlaceOrderButton=By.cssSelector("button[class=\"btn btn-success\"]");
	private By Delete1stItemInCart=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[1]/td[4]/a");
	private By Delete2ndItemInCart=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[2]/td[4]/a");
	private  By FirstItemPriceFromCart=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[1]/td[3]");
	private  By SecondItemPriceFromCart=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[2]/td[3]");
	private  By FirstItemNameFromCart=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[2]/td[2]");
	private  By SecondItemNameFromCart=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[1]/td[2]");
	private  By TotalPriceFromCart=By.id("totalp");
	private WebElement PlaceOrderButtonElement;
	private WebElement Delete1stItemInCartElement;
	private WebElement Delete2ndItemInCartElement;
	private  WebElement FirstItemPriceFromCartElement;
	private  WebElement FirstItemNameFromCartElement;
	private  WebElement SecondItemPriceFromCartElement;	
	private  WebElement SecondItemNameFromCartElement;
	private  WebElement TotalPriceFromCartElement;

	
	public PlaceOrderPage ClickingPlaceOrder()
	{
		PlaceOrderButtonElement=driver.findElement(PlaceOrderButton);
		Clicking(PlaceOrderButtonElement);
		return new PlaceOrderPage(driver);
	}
	public void DeleteFirstItemFromCart()
	{
		Delete1stItemInCartElement=driver.findElement(Delete1stItemInCart);
		Clicking(Delete1stItemInCartElement);
	}
	public void DeleteSecondItemFromCart()
	{
		Delete2ndItemInCartElement=driver.findElement(Delete2ndItemInCart);
		Clicking(Delete2ndItemInCartElement);
	}
	public void CheckingTotalPriceInCartPage()
	{
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("totalp")), "1180"));
		Assert.assertTrue(driver.findElement(By.id("totalp")).getText().contains("1180"));
	}

}
