package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class MyWalletModule extends BaseClass{
	
	public static String CouponCode;
	
	@Test
	public void myWallet() throws InterruptedException {
		loginModule.shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.myWallet_button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | My Wallet"));
		assertEquals(driver.getTitle(), "ShoppersStack | My Wallet", "Wrong page title");
		myWallet.UseCoupon_Button.click();
		CouponCode = new Scanner(System.in).nextLine();
		myWallet.CouponCode_TF.sendKeys(CouponCode);
		myWallet.Verify_Button.click();
		Thread.sleep(3000);
	}
}
