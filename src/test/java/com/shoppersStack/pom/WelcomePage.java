package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	

	@FindBy(xpath = "//button[text()='Login']")
	public WebElement Login_btn;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//<<<<<<< HEAD
//=======

//>>>>>>> branch 'master' of https://github.com/Rangaiah523/Rangaiah
}
