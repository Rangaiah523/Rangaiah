package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class MyProfileModule extends BaseClass {
	@Test(priority = 1)
	public void uploadImage() {
		new LoginModule().shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Profile"));
		assertEquals(driver.getTitle(), "ShoppersStack | Profile", "Page title is wrong");
		
	}
}
