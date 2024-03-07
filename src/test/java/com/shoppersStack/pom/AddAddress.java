package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddress {
	//Home
	@FindBy(xpath = "//input[@id=\"Name\"]")
	public WebElement name_Textfield;
	
	@FindBy(xpath ="//input[@id=\"House/Office Info\"]")
	public WebElement HouseOffice_TextField;
	
	@FindBy(xpath = "//input[@id=\"Street Info\"]")
	public WebElement strretInfo_Textfield;
	
	@FindBy(xpath ="//input[@id=\"Landmark\"]")
	public WebElement landMark_Textfield;
	
	@FindBy(xpath = "//input[@id=\"Pincode\"]")
	public WebElement pincodeTextfield;
	
	@FindBy(xpath = "//input[@id=\"Phone Number\"]")
	public WebElement phoneNumber_Textfield;
	
	@FindBy(xpath = "//button[text()='Add Address']")
	public WebElement addAddress_Button;
	
	@FindBy(xpath = "//select[@id=\"Country\"]")
	public WebElement contry_Dropdown;
	
	@FindBy(xpath = "//select[@id=\"State\"]")
	public WebElement state_Dropdown;
	
	@FindBy(xpath = "//select[@id=\"City\"]")
	public WebElement cityDropdown;
	
	//Office
	@FindBy(xpath = "//span[text()='Office']")
	public WebElement officeRadioButton;
	
	public AddAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}

