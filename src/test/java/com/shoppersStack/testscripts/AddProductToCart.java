package com.shoppersStack.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class AddProductToCart extends BaseClass{
	@Test(priority = 1)
	public void addProductToCart() throws InterruptedException {
		loginModule.shopperLogin();
		actions.scrollToElement(homePage.addToCart_Button).perform();
		homePage.addToCart_Button.click();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		logoutModule.LogoutSg();
	}
	
	@Test(priority = 2)
	public void editProductInCart() throws InterruptedException {
		loginModule.shopperLogin();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Cart", "Wrong page title");
		addToCart.increaseQuantity_Button.click();
		Thread.sleep(3000);
		logoutModule.LogoutSg();
	}
	
	@Test(priority = 3)
	public void deleteProductFromCart() throws InterruptedException {
		loginModule.shopperLogin();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Cart", "Wrong page title");
		addToCart.RemoveFromCart_Button.click();
		Thread.sleep(3000);
		addToCart.Yes_Button.click();
		Thread.sleep(3000);
		logoutModule.LogoutSg();
	}
}
