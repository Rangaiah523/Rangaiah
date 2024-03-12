package com.shoppersStack.pom;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppersStack.generic.BaseClass;

public class CouponGeneratorPage extends BaseClass{
	
	@FindBy(xpath = "//span[text()=\"coupon\"]")
	public WebElement couponGenerator_Text;
	
	@FindBy(xpath = "//input[@type=\"email\"]")
	public WebElement email_Textfield;
	
	@FindBy(xpath = "//input[@id=\":r3:\"]")
	public WebElement fullName_Textfield;
	
	@FindBy(xpath = "//input[@id=\":r4:\"]")
	public WebElement cost_Textfiled;
	
	@FindBy(xpath = "//input[@id=\"startDate\"]")
	public WebElement startDate_Textfield;
	
	@FindBy(xpath = "//input[@id=\"endDate\"]")
	public WebElement endDate_TextFiled;
	
	@FindBy(xpath = "//input[@id=\":r7:\"]")
	public WebElement vochercount_Textfiled;
	
	@FindBy(xpath = "//div[@aria-haspopup=\"listbox\"]")
	public WebElement applicationName_Dropdown;
	
	@FindBy(xpath = "//li[text()='ShoppingKart']")
	public WebElement shoppingKart_Button;
	
	@FindBy(xpath = "//button[text()='Generate']")
	public WebElement generate_Button;
	
	
	
	public CouponGeneratorPage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}
}
