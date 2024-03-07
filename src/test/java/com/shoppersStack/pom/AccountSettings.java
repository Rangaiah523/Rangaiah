package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings {
public AccountSettings(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
}
}
