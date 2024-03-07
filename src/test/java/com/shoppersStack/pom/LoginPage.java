package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"Email\"]")
	public WebElement Email_txtfield;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	public WebElement Password_txtfield;

	@FindBy(xpath = "//*[@id=\"Login\"]")
	public WebElement Login_btn;

	@FindBy(xpath = "//*[@id=\"Create Account\"]")
	public WebElement CreateAccount_btn;

	@FindBy(xpath = "//*[@id=\"Forgot Password?\"]")
	public WebElement ForgotPassword_link;

	@FindBy(xpath = "//*[@id=\"vertical-tab-1\"]")
	public WebElement MerchantLogin_btn;

	@FindBy(xpath = "//*[@id=\"vertical-tab-2\"]")
	public WebElement AdminLogin_btn;
}
