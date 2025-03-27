package coreElements;

import org.openqa.selenium.By;

public class CheckBoxes extends Elements{

	public CheckBoxes(By Locator) {
		super(Locator);
		// TODO Auto-generated constructor stub
	}
	
	public void Check()
	{
		driver.findElement(byLocator).click();
	}

}
