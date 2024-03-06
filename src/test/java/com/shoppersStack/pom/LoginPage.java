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
	WebElement Email_txtfield;

	public WebElement Email_txtfield() {
		return Email_txtfield;
	}

	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement Password_txtfield;

	public WebElement Password_txtfield() {
		return Password_txtfield;
	}

	@FindBy(xpath = "//*[@id=\"Login\"]")
	WebElement Login_btn;

	public WebElement Login_btn() {
		return Login_btn;
	}

	@FindBy(xpath = "//*[@id=\"Create Account\"]")
	WebElement CreateAccount_btn;

	public WebElement CreateAccount_btn() {
		return CreateAccount_btn;
	}

	@FindBy(xpath = "//*[@id=\"Forgot Password?\"]")
	WebElement ForgotPassword_link;

	public WebElement ForgotPassword_link() {
		return ForgotPassword_link;
	}

	@FindBy(xpath = "//*[@id=\"vertical-tab-1\"]")
	WebElement MerchantLogin_btn;

	public WebElement MerchantLogin_btn() {
		return MerchantLogin_btn;
	}

	@FindBy(xpath = "//*[@id=\"vertical-tab-2\"]")
	WebElement AdminLogin_btn;

	public WebElement AdminLogin_btn() {
		return AdminLogin_btn;
	}
}
