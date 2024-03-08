package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='buynow_fl']")
	public WebElement buynow_Button;
	
	@FindBy(xpath = "(//div[@class='cart_quantity__Eg+qv']/*[@id='increase'])[1]")
	public WebElement increaseQuantity_Button;
	
	@FindBy(xpath = "(//button[text()='Remove from cart'])[1]")
	public WebElement RemoveFromCart_Button; 
	
	@FindBy(xpath = "(//button[text()='Yes'])[1]")
	public WebElement Yes_Button;
	
}
