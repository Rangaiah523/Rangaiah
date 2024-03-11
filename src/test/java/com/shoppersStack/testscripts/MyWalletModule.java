package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class MyWalletModule extends BaseClass{
	
	@Test
	public void myWallet() {
		loginModule.shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.myWallet_button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | My Wallet"));
		assertEquals(driver.getTitle(), "ShoppersStack | My Wallet", "Wrong page title");
		
	}
}
