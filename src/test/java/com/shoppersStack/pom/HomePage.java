package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	@FindBy(xpath = "//*[.='Home'and @class='active']")
	public WebElement home_link;
	
	@FindBy(xpath = "//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]")
	public  WebElement profile_Button;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	public WebElement accountSettings_Button;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}