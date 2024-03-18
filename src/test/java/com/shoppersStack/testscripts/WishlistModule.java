package com.shoppersStack.testscripts;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class WishlistModule extends BaseClass {

	@Test(priority = 1)
	public void addItemToWishlist() throws InterruptedException {
		loginModule.shopperLogin();
		actions.scrollToElement(wishlistPage.wishList_btn()).perform();
		wishlistPage.wishList_btn().click();
		homePage.accountSettings_btn.click();
		homePage.wishList_button.click();
		driver.navigate().refresh();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Wishlist"));
		assertEquals(driver.getTitle(), "ShoppersStack | Wishlist", "Wrong page title");
		actions.scrollToElement(wishlistPage.wishList_product_txt()).perform();
		wishlistPage.wishList_product_txt().isDisplayed();
	}
	
	@Test(priority = 2)
	public void removeItemFromWishlist() throws InterruptedException {
		loginModule.shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.wishList_button.click();
		driver.navigate().refresh();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Wishlist"));
		assertEquals(driver.getTitle(), "ShoppersStack | Wishlist", "Wrong page title");
		actions.scrollToElement(wishlistPage.wishList_product_txt()).perform();
		wishlistPage.wishList_product_txt().isDisplayed();
		wishlistPage.removeFromWishlist_btn().click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		wishlistPage.wishlistIsEmpty_txt.isDisplayed();		
	}
}