package org.sample.TestingDemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageAllProducts extends Utility 
{
	public HomePageAllProducts(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By HomeButton=By.cssSelector("li[class=\"nav-item active\"]>a");
	private By ContactUsButton=By.xpath("(//li[@class=\"nav-item\"])[1]/a");

    private By CartButton=By.cssSelector("li[class=\"nav-item\"]>a[id=\"cartur\"]");
	private By LoginMenuButton=By.id("login2");
	private By SignUpMenuButton=By.id("signin2");
	/*
	private By AboutUsButton=By.xpath("(//li[@class=\"nav-item\"])[2]/a");
	private By NextIconArrow=By.cssSelector("span[class=\"carousel-control-next-icon\"]");
	private By PreviousIconArrow=By.cssSelector("span[class=\"carousel-control-prev-icon\"]");
	*/
	private By LogoutButton=By.id("logout2");
	private By PhoneCategoryButton=By.cssSelector("a[onclick=\"byCat('phone')\"]");
	private By LaptopCategoryButton=By.cssSelector("a[onclick=\"byCat('notebook')\"]");
	private By MonitorCategoryButton=By.cssSelector("a[onclick=\"byCat('monitor')\"]");
	public By FirstProductNameFromHome=By.xpath("(//a[@class=\"hrefch\"])[1]");
	public By FirstProductPriceFromHome=By.xpath("(//div[@class=\"card-block\"])[1]/h5");
	public By SecondProductNameFromHome=By.xpath("(//a[@class=\"hrefch\"])[2]");
	public By SecondProductPriceFromHome=By.xpath("(//div[@class=\"card-block\"])[2]/h5");


	public WebElement FirstProductNameFromHomeElement;
	public WebElement SecondProductNameFromHomeElement;
	public WebElement FirstProductPriceFromHomeElement;
	public WebElement SecondProductPriceFromHomeElement;
	private WebElement HomeButtonElement;
	private WebElement ContactUsButtonElement;
	private WebElement CartButtonElement;
	private WebElement LoginMenuButtonElement;
	private WebElement LogoutButtonElement;
	private WebElement SignUpMenuButtonElement;
	/*
	private WebElement NextIconArrowElement;
	private WebElement PreviousIconArrowElement;
	private WebElement AboutUsButtonElement;
	*/
	private WebElement PhoneCategoryButtonElement;
	private WebElement LaptopCategoryButtonElement;
	private WebElement MonitorCategoryButtonElement;

	

public void ClickingHome()
{
	HomeButtonElement=driver.findElement(HomeButton);
	Clicking(HomeButtonElement);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
public ContactUs ClickingContactUs()
{
	ContactUsButtonElement=driver.findElement(ContactUsButton);
	Clicking(ContactUsButtonElement);
	return new ContactUs(driver);
}
public LoginPage ClickingLogin()
{
	LoginMenuButtonElement=driver.findElement(LoginMenuButton);
	Clicking(LoginMenuButtonElement);
	return new LoginPage(driver);
}
public SignUpPage ClickingSignUp()
{
	SignUpMenuButtonElement=driver.findElement(SignUpMenuButton);
	Clicking(SignUpMenuButtonElement);
	return new SignUpPage(driver);
}
public void ClickingLogout()
{
	LogoutButtonElement=driver.findElement(LogoutButton);
	Clicking(LogoutButtonElement);
}
public CartPage ClickingCart()
{
	CartButtonElement=driver.findElement(CartButton);
	Clicking(CartButtonElement);
	return new CartPage(driver);
}
public void ChoosingPhonesCategory()
{
	PhoneCategoryButtonElement=driver.findElement(PhoneCategoryButton);
	Clicking(PhoneCategoryButtonElement);
}
public void ChoosingLaptopsCategory()
{
	LaptopCategoryButtonElement=driver.findElement(LaptopCategoryButton);
	Clicking(LaptopCategoryButtonElement);
}
public void ChoosingMonitorsCategory()
{
	MonitorCategoryButtonElement=driver.findElement(MonitorCategoryButton);
	Clicking(MonitorCategoryButtonElement);
}
public ProductDetailsPage ChoosingFirstItem()
{
	FirstProductNameFromHomeElement=driver.findElement(FirstProductNameFromHome);
	Clicking(FirstProductNameFromHomeElement);
	return new ProductDetailsPage(driver);
}
public ProductDetailsPage ChoosingSecondItem()
{
	SecondProductNameFromHomeElement=driver.findElement(SecondProductNameFromHome);
	Clicking(SecondProductNameFromHomeElement);
	return new ProductDetailsPage(driver);
}	
	
}
