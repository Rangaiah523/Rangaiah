package com.shoppersStack.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class LoginModule extends BaseClass {
	@Test
	public void shopperLogin() {
		welcomePage.Login_btn.click();
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
	}

	@Test
	public void adminLogin() {
		welcomePage.Login_btn.click();
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.AdminLogin_btn.click();
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		homePage.home_link.isDisplayed();
	}
}