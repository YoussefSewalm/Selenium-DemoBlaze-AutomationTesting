package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ProductDetailsPage extends Utility {

public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

HomePageAllProducts homepage;
ProductDetailsPage productdetailspage;

private By ProductNameFromProductDetails=By.cssSelector("h2[class=\"name\"]");
private By ProductPriceFromProductDetials=By.cssSelector("h3[class=\"price-container\"]");
private By AddToCartButton=By.cssSelector("a[class=\"btn btn-success btn-lg\"]");


private  WebElement ProductNameFromProductDetailsElement;
private  WebElement ProductPriceFromProductDetailsElement;
private WebElement AddToCartButtonElement;

public void AddToCart()
{
	AddToCartButtonElement=driver.findElement(AddToCartButton);
	Clicking(AddToCartButtonElement);
}
public void HandlingAddToCartAlert()
{
	new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
	boolean expected_7=true;
	boolean actual_7=driver.switchTo().alert().getText().contains("added");
	Assert.assertEquals(actual_7, expected_7);
	driver.switchTo().alert().accept();
}
public void CheckingFirstItemNameAndPrice()
{
	new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("h2[class=\"name\"]"))));
	Assert.assertTrue(driver.findElement(By.cssSelector("h2[class=\"name\"]")).getText().contains("s6"));
	Assert.assertTrue(driver.findElement(By.cssSelector("h3[class=\"price-container\"]")).getText().contains("360"));
}
public void CheckingSecondItemNameAndPrice()
{
	new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("h2[class=\"name\"]"))));
	Assert.assertTrue(driver.findElement(By.cssSelector("h2[class=\"name\"]")).getText().contains("lumia"));
	Assert.assertTrue(driver.findElement(By.cssSelector("h3[class=\"price-container\"]")).getText().contains("820"));
}
}
