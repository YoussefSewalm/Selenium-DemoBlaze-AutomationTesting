package Locators;

import org.openqa.selenium.By;

public class L5_SignUpPage {

	//Texts
	public static By VerifySignUpPageText = By.id("signInModalLabel");
	
	//Buttons
	public static By ConfirmSignUpButton = By.xpath("//button[contains(text(),'Sign up')]");
	public static By CloseSignUpMenuButton = By.xpath("//button[contains(text(),'Sign up')]/preceding-sibling::button");

	//FormFields
	public static By SignUpUserNameFormField = By.id("sign-username");
	public static By SignUpPasswordFormField = By.id("sign-password");
	
}
