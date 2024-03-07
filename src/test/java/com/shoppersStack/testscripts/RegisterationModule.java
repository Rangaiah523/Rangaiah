package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;
import com.shoppersStack.pom.LoginPage;
import com.shoppersStack.pom.WelcomePage;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class RegisterationModule extends BaseClass {

	@Test(priority = 1)
	public void shopperRegister() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.CreateAccount_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Shopper | Signup"));
		assertEquals(driver.getTitle(), "ShoppersStack | Shopper | Signup", "Wrong page title");
	}
}
