package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppersStack.generic.BaseClass;

public class WelcomePage extends BaseClass {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Login']")
	WebElement Login_btn;

	public WebElement Login_btn() {
		return Login_btn;
	}
}
