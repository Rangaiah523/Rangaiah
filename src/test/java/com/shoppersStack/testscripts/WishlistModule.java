package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class WishlistModule extends BaseClass {

	@Test(priority = 1)
	public void addItemToWishlist() throws InterruptedException {
		loginModule.shopperLogin();
//		actions.scrollToElement(wishlistPage.wishList_btn).perform();
//		wishlistPage.wishList_btn.click();
		homePage.accountSettings_btn.click();
		homePage.wishList_button.click();
		driver.navigate().refresh();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Wishlist"));
		assertEquals(driver.getTitle(), "ShoppersStack | Wishlist", "Wrong page title");
//		actions.scrollToElement(WishlistPage.productName_txt).perform();
//		WishlistPage.productName_txt.isDisplayed();
		Thread.sleep(2000);
	}
}