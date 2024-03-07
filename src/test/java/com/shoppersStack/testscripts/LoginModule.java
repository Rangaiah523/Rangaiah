package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;
import com.shoppersStack.pom.HomePage;
import com.shoppersStack.pom.LoginPage;
import com.shoppersStack.pom.WelcomePage;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class LoginModule extends BaseClass {
	@Test(priority = 1)
	public void shopperLogin() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
	}

	@Test(priority = 2)
	public void adminLogin() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.AdminLogin_btn.click();
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		HomePage homePage = new HomePage(driver);
		homePage.home_link.isDisplayed();
	}
}