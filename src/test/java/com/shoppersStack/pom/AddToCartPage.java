package com.shoppersStack.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {

	@FindBy(xpath = "//button[@id='buynow_fl']")
	public WebElement profile_Button;
	
	@FindBy(id = "20496")
	public WebElement Address;
}
