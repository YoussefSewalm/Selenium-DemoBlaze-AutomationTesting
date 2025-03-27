package coreElements;

import org.openqa.selenium.By;

public class FormFields extends Elements{

	public FormFields(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	
	public void sendText(String Text)
	{
		driver.findElement(byLocator).clear();
		driver.findElement(byLocator).sendKeys(Text);
	}
	public void clearText()
	{
		driver.findElement(byLocator).clear();
	}

}
