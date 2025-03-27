package Pages;
import static Locators.L3_PlaceOrderPage.*;
import coreElements.*;

public class P3_PlaceOrder {

	//Texts
	public static Texts VerifyTotalPrice = new Texts(VerifyTotalPriceText);
	public static Texts VerifyPlacingOrder = new Texts(VerifyPlacingOrderText);

	//Buttons
	public static Buttons Purchase = new Buttons(PurchaseButton);
	public static Buttons Close = new Buttons(CloseButton);
	public static Buttons Ok = new Buttons(OkButton);
	
	//FormFields
	public static FormFields Name = new FormFields(NameFormField);
	public static FormFields Country = new FormFields(CountryFormField);
	public static FormFields City = new FormFields(CityFormField);
	public static FormFields CreditCard = new FormFields(CreditCardFormField);
	public static FormFields Month= new FormFields(MonthFormField);
	public static FormFields Year = new FormFields(YearFormField);
}
