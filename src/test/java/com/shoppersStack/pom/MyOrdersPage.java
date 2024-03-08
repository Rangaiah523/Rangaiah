package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {


	public MyOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[text()='Cancel Order'])[1]")
	public WebElement cancelOrder_Button;
	
	@FindBy(xpath = "(//button[text()='Yes'])[1]")
	public WebElement yes_Button;
}
