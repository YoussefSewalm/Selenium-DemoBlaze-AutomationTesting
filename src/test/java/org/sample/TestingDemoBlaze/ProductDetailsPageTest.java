package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ProductDetailsPageTest extends TestBase {
	
	HomePageAllProducts homepage;
	ProductDetailsPage productdetailspage;
	CartPage cartpage;
	
	@Test
	public void AddingRemovingMobileItemToCart()
	{
		homepage=new HomePageAllProducts(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@class=\"hrefch\"])[1]"))));
		productdetailspage=homepage.ChoosingFirstItem();
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("h2[class=\"name\"]"))));
        productdetailspage.CheckingFirstItemNameAndPrice();
		productdetailspage.AddToCart();
	    productdetailspage.HandlingAddToCartAlert();
		cartpage=homepage.ClickingCart();
		cartpage.DeleteFirstItemFromCart();
		homepage.ClickingHome();
	}

}
