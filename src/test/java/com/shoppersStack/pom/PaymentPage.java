package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@name='radio-buttons-group'])[2]")
	public WebElement COD_Radio_Button;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	public WebElement Proceed_Button;
}
