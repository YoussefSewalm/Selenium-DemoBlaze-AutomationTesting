package Locators;

import org.openqa.selenium.By;

public class L4_LoginPage {
	
	//Texts
	public static By VerifyLoginPageText = By.id("logInModalLabel");
	public static By VerifyLoginSuccessfullyText = By.xpath("//a[contains(text(),'Welcome')]");
	
	//Buttons
	public static By ConfirmLoginButton = By.xpath("//button[contains(text(),'Log in')]");
	public static By CloseLoginMenuButton = By.xpath("//button[contains(text(),'Log in')]/preceding-sibling::button");
	
	//FormFields
	public static By LoginUserNameFormField = By.id("loginusername");
	public static By LoginPasswordFormField = By.id("loginpassword");
	
	//Links
	public static By LogOutLink = By.xpath("//a[contains(text(),'Log out')]");

}
