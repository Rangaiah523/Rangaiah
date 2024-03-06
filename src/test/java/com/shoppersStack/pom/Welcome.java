package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseClass;

public class Welcome extends BaseClass {

	@FindBy(xpath = "//button[text()='Login']")
	WebElement Login;

	public Welcome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement Login() {
		return Login;
	}
}
