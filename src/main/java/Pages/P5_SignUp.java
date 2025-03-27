package Pages;

import static Locators.L5_SignUpPage.*;
import coreElements.*;

public class P5_SignUp {

	//Texts
	public static Texts VerifySignUpPage = new Texts(VerifySignUpPageText);
	
	//Buttons
	public static Buttons ConfirmSignUp = new Buttons(ConfirmSignUpButton);
	public static Buttons CloseSignUpMenu = new Buttons(CloseSignUpMenuButton);
	
	//FormFields
	public static FormFields SignUpUserName = new FormFields(SignUpUserNameFormField);
	public static FormFields SignUpPassword = new FormFields(SignUpPasswordFormField);
}
