package coreElements;

import org.openqa.selenium.By;

public class Links extends Elements{

	public Links(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	public void Navigate()
	{
		driver.findElement(byLocator).click();
	}

}
