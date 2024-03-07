package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]")
	public WebElement profile_Button;

	@FindBy(xpath = "//li[text()='My Profile']")
	public WebElement accountSettings_Button;

	@FindBy(xpath = "//*[.='Home'and @class='active']")
	public WebElement home_link;
	
	@FindBy(xpath = "//div[.='Profile Created Successfully']")
	public WebElement Profile_Created_Successfully_txt;
	
	@FindBy(xpath = "//div[.='Successfully Registered']")
	public WebElement SuccessfullyRegistered_txt;

}