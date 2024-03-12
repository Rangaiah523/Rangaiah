package com.shoppersStack.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class BuyModule extends BaseClass{
	
	@Test
	public void orderProduct() throws InterruptedException{
		loginModule.shopperLogin();
		actions.scrollToElement(homePage.addToCart_Button).perform();
		homePage.addToCart_Button.click();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Cart"));
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Cart", "Wrong page title");
		addToCart.buynow_Button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Saved Addresses"));
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Saved Addresses", "Wrong page title");
		myAddress.AddressRadio_Button.click();
		myAddress.Proceed_Button.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Payment"));
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Payment", "Wrong page title");
		paymentpage.COD_Radio_Button.click();
		paymentpage.Proceed_Button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Order Confirmation"));
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Order Confirmation", "Wrong page title");
		Thread.sleep(7000);
		logoutModule.LogoutSg();
	}
	
	@Test
	public void cancelOrder() throws InterruptedException{
		loginModule.shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.myOrders_button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | My Orders"));
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | My Orders", "Wrong page title");
		myOrderPage.cancelOrder_Button.click();
		Thread.sleep(3000);
		myOrderPage.yes_Button.click();
		Thread.sleep(7000);
		logoutModule.LogoutSg();
	}
}
