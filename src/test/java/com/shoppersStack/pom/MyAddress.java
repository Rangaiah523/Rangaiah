package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MyAddress {

	@FindBy(xpath = "//button[text()='Add Address']")
	public WebElement Addaddress_Button;
	
	@FindBy(xpath = "(//input[@name='address'])[1]")
	public WebElement AddressRadio_Button;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	public WebElement Proceed_Button;
	
	public MyAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}