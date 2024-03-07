package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	
	@FindBy(xpath="//button[@aria-label='Account settings']")
	public WebElement accountSettings;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	public WebElement profile;
	
	@FindBy(xpath = "//div[@class='r1']/button")
	public WebElement editProfile;
	
	@FindBy(xpath = "//input[@id='First Name']")
	public WebElement firstNameField;
	
	@FindBy(xpath = "//button[@id='submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//li[text()='Logout']")
	public WebElement logoutLink;
	
	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
