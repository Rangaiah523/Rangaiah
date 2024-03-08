package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class LogoutModule extends BaseClass {
	LoginModule loginModule = new LoginModule();

	@Test()
	public void Logout() throws InterruptedException {
		loginModule.shopperLogin();
		homePage.accountSettings_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(homePage.logout_Button));
		Thread.sleep(3000);
		homePage.logout_Button.click();
		assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/", "Logout is UnSccessFul");

	}
	
	public void LogoutSg() throws InterruptedException {
		homePage.accountSettings_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(homePage.logout_Button));
		Thread.sleep(3000);
		homePage.logout_Button.click();
		assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/", "Logout is UnSccessFul");

	}

}
