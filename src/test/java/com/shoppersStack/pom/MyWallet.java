package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWallet {
	public MyWallet(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Coupon Code")
	public WebElement CouponCode_TF;
	
	@FindBy(id = "Verify")
	public WebElement Verify_Button;
}
