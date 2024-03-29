package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppersStack.generic.BaseClass;

public class HomePage extends BaseClass {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Account settings']")
	public WebElement accountSettings_btn;

	@FindBy(xpath = "//*[.='Home'and @class='active']")
	public WebElement home_link;

	@FindBy(xpath = "//div[.='Profile Created Successfully']")
	public WebElement Profile_Created_Successfully_txt;

	@FindBy(xpath = "//div[.='Successfully Registered']")
	public WebElement SuccessfullyRegistered_txt;

	@FindBy(xpath = "//select[@id='category']")
	public WebElement category_Dropdown;

	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchTextField;

	@FindBy(xpath = "//*[local-name()='svg' and @name='searchBtn']")
	public WebElement Search_Icon;

	@FindBy(xpath = "//a[@id='cart']/*[@id='cartIcon']")
	public WebElement cart_Icon;

	@FindBy(xpath = "(//button[@id='addToCart'])[4]")
	public WebElement addToCart_Button;

	@FindBy(xpath = "//li[text()='My Profile']")
	public WebElement myProfile_button;

	@FindBy(xpath = "//li[.='Wish List']")
	public WebElement wishList_button;

	@FindBy(xpath = "//li[.='My Orders']")
	public WebElement myOrders_button;

	@FindBy(xpath = "//li[.='My Wallet']")
	public WebElement myWallet_button;

	@FindBy(xpath = "//li[.='My Likes']")
	public WebElement myLikes_button;

	@FindBy(xpath = "//li[.='Logout']")
	public WebElement logout_Button;

	@FindBy(xpath = "//a[@href=\"https://voucher.shoppersstack.com\"]")
	public WebElement vocher_Button;

	@FindBy(xpath = "//div[.='Success']")
	public WebElement Success_txt;
}