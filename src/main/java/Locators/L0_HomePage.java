package Locators;

import org.openqa.selenium.By;

public class L0_HomePage {
	
	//Links
	public static By HomePageLink = By.cssSelector("li[class=\"nav-item active\"]>a");
	public static By ContactLink = By.xpath("//a[contains(text(),'Contact')]");
	public static By AboutUsLink = By.xpath("//a[contains(text(),'About us')]");
	public static By CartLink = By.xpath("//a[contains(text(),'Cart')]");
	public static By LoginLink = By.xpath("//a[contains(text(),'Log in')]");
	public static By SignUpLink = By.xpath("//a[contains(text(),'Sign up')]");
	public static By FirstPhoneLink = By.xpath("//a[contains(text(),'s6')]");
	public static By SecondPhoneLink = By.xpath("//a[contains(text(),'1520')]");
	public static By PhonesLink = By.xpath("//a[contains(text(),'Phones')]");
	public static By LaptopsLink = By.xpath("//a[contains(text(),'Laptops')]");
	public static By MonitorsLink = By.xpath("//a[contains(text(),'Monitors')]");
	
	//Texts
	public static By FirstPhonePriceFromHomeText = By.xpath("//a[contains(text(),'s6')]//parent::h4//parent::div//h5");
	public static By SecondPhonePriceFromHomeText = By.xpath("//a[contains(text(),'1520')]//parent::h4//parent::div//h5");
	public static By FirstPhoneNameFromHomeText = By.xpath("//a[contains(text(),'s6')]");
	public static By SecondPhoneNameFromHomeText = By.xpath("//a[contains(text(),'1520')]");
	public static By FirstPhoneArticleText = By.xpath("//a[contains(text(),'s6')]//parent::h4//parent::div//p");
	public static By FirstLaptopArticleText = By.xpath("//a[contains(text(),'i5')]//parent::h4//parent::div//p");
	public static By FirstMonitorArticleText = By.xpath("//a[contains(text(),'Apple')]//parent::h4//parent::div//p");
	

}
