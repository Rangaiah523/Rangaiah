package com.shoppersStack.testscripts;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.shoppersStack.generic.BaseClass;

public class AddProductToCart extends BaseClass{
	@Test(priority = 1)
	public void addProductToCart() throws InterruptedException, EncryptedDocumentException, IOException {
		loginModule.shopperLogin();
		actions.scrollToElement(homePage.addToCart_Button).perform();
		homePage.addToCart_Button.click();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		logoutModule.LogoutSg();
	}
	
	@Test(priority = 2)
	public void editProductInCart() throws InterruptedException, EncryptedDocumentException, IOException {
		loginModule.shopperLogin();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "ShoppersStack | Cart", "Wrong page title");
		addToCart.increaseQuantity_Button.click();
		Thread.sleep(3000);
		logoutModule.LogoutSg();
	}
	
	@Test(priority = 3)
	public void deleteProductFromCart() throws InterruptedException, EncryptedDocumentException, IOException {
		loginModule.shopperLogin();
		homePage.cart_Icon.click();
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "ShoppersStack | Cart", "Wrong page title");
		addToCart.RemoveFromCart_Button.click();
		Thread.sleep(3000);
		addToCart.Yes_Button.click();
		Thread.sleep(3000);
		logoutModule.LogoutSg();
	}
}
