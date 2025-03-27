package Pages;
import static Locators.L4_LoginPage.*;

import coreElements.*;

public class P4_Login {
	
	//Texts
	public static Texts VerifyLoginPage = new Texts(VerifyLoginPageText);
	public static Texts VerifyLoginSuccessfully = new Texts(VerifyLoginSuccessfullyText);
	
	//Buttons
	public static Buttons ConfirmLogin = new Buttons(ConfirmLoginButton);
	public static Buttons CloseLoginMenu = new Buttons(CloseLoginMenuButton);
	
	//FormFields
	public static FormFields LoginUserName = new FormFields(LoginUserNameFormField);
	public static FormFields LoginPassword = new FormFields(LoginPasswordFormField);
	
	//Links
	public static Links LogOut = new Links(LogOutLink);

}
