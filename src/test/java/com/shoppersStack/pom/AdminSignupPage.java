package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSignupPage {
	public AdminSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"First Name\"]")
	public WebElement First_Name_txtfield;

	@FindBy(xpath = "//*[@id=\"Last Name\"]")
	public WebElement Last_Name_txtfield;

	@FindBy(xpath = "//*[@id=\"Male\"]")
	public WebElement Gender_Male_radiobtn;

	@FindBy(xpath = "//*[@id=\"Phone Number\"]")
	public WebElement Phone_No_txtfield;

	@FindBy(xpath = "//*[@id=\"Email Address\"]")
	public WebElement Email_Address_txtfield;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	public WebElement Password_txtfield;

	@FindBy(xpath = "//*[@id=\"Confirm Password\"]")
	public WebElement Confirm_Password_txtfield;
	
	@FindBy(xpath = "//*[@id=\"Country\"]")
	public WebElement Country_dropdown;
	
	@FindBy(xpath = "//*[@id=\"State\"]")
	public WebElement State_dropdown;
	
	@FindBy(xpath = "//*[@id=\"City\"]")
	public WebElement City_dropdown;

	@FindBy(xpath = "//button[.=\"Register\"]")
	public WebElement Register_btn;
}