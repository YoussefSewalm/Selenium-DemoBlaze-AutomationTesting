package coreElements;

import org.openqa.selenium.By;

public class Buttons extends Elements{

	public Buttons(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	public void Click()
	{
		driver.findElement(byLocator).click();
	}

}
