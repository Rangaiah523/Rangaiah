package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class BuyModule extends BaseClass{
	
	@Test
	public void orderProduct() throws InterruptedException {
		loginModule.shopperLogin();
		actions.scrollToElement(homePage.addToCart_Button).perform();
		homePage.addToCart_Button.click();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		addToCart.buynow_Button.click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		myAddress.AddressRadio_Button.click();
		myAddress.Proceed_Button.click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		paymentpage.COD_Radio_Button.click();
		paymentpage.Proceed_Button.click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
	}
}
