package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings {

	
	@FindBy(xpath = "//div[text()='My Addresses']")
	public WebElement myAddress_Button;
	

public AccountSettings(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
	