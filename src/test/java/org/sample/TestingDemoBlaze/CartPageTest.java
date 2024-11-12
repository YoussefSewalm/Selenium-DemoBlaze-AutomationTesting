package org.sample.TestingDemoBlaze;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sample.TestingDemoBlaze.ReadDataFromExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CartPageTest extends TestBase{
	HomePageAllProducts homepage;
	ProductDetailsPage productdetailspage;
	CartPage cartpage;
	PlaceOrderPage placeorderpage;
	
	@DataProvider(name="PlaceOutInformation")
	public String [][] PlaceOutInfo() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadPlaceOrderInfo();
	}
	
	@Test(dataProvider="PlaceOutInformation")
	public void BuyingTwoDiffItems(String name,String country,String city,String creditcard,String month,String year)
	{
		homepage=new HomePageAllProducts(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@class=\"hrefch\"])[1]"))));
		productdetailspage=homepage.ChoosingFirstItem();
		productdetailspage.CheckingFirstItemNameAndPrice();
		productdetailspage.AddToCart();
		productdetailspage.HandlingAddToCartAlert();
		homepage.ClickingHome();	
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@class=\"hrefch\"])[2]"))));
		productdetailspage=homepage.ChoosingSecondItem();
        productdetailspage.CheckingSecondItemNameAndPrice();
		productdetailspage.AddToCart();
		productdetailspage.HandlingAddToCartAlert();
		cartpage=homepage.ClickingCart();
        cartpage.CheckingTotalPriceInCartPage();
		placeorderpage=cartpage.ClickingPlaceOrder();
		placeorderpage.CheckingTotalPriceInPlaceOrder();
		placeorderpage.FillingPlaceOrderInfo(name, country, city, creditcard, month, year);
		placeorderpage.ClickingPurchase();
		placeorderpage.VerifyingPlacingOrder();
		placeorderpage.ClickingOkAfterPurchase();
	}
}
