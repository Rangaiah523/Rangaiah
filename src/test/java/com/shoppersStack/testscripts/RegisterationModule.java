package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;
import com.shoppersStack.pom.ShopperSignupPage;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class RegisterationModule extends BaseClass {

	@Test(priority = 1)
	public void shopperRegister() throws InterruptedException {
		
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.CreateAccount_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Shopper | Signup"));
		assertEquals(driver.getTitle(), "ShoppersStack | Shopper | Signup", "Wrong page title");
		ShopperSignupPage shopperSignupPage = new ShopperSignupPage(driver);
		shopperSignupPage.First_Name_txtfield.sendKeys(faker.name().firstName());
		shopperSignupPage.Last_Name_txtfield.sendKeys(faker.name().lastName());
		shopperSignupPage.Gender_Male_radiobtn.click();
		shopperSignupPage.Phone_No_txtfield.sendKeys(faker.phoneNumber().phoneNumber());
		shopperSignupPage.Email_Address_txtfield.sendKeys(faker.internet().emailAddress());
		shopperSignupPage.Password_txtfield.sendKeys("Test@123");
		shopperSignupPage.Confirm_Password_txtfield.sendKeys("Test@123");
		shopperSignupPage.Terms_Conditions_chkbox.click();
//		shopperSignupPage.Register_btn.click();

		Thread.sleep(2000);
	}
}
