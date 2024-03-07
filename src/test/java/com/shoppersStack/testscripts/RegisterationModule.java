package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class RegisterationModule extends BaseClass {

	@Test(priority = 1)
	public void shopperRegister() throws InterruptedException {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.CreateAccount_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Shopper | Signup"));
		assertEquals(driver.getTitle(), "ShoppersStack | Shopper | Signup", "Wrong page title");
		shopperSignupPage.First_Name_txtfield.sendKeys(faker.name().firstName());
		shopperSignupPage.Last_Name_txtfield.sendKeys(faker.name().lastName());
		shopperSignupPage.Gender_Male_radiobtn.click();
		shopperSignupPage.Phone_No_txtfield.sendKeys(faker.phoneNumber().phoneNumber());
		shopperSignupPage.Email_Address_txtfield.sendKeys(faker.internet().emailAddress());
		shopperSignupPage.Password_txtfield.sendKeys("Test@123");
		shopperSignupPage.Confirm_Password_txtfield.sendKeys("Test@123");
		shopperSignupPage.Terms_Conditions_chkbox.click();
		shopperSignupPage.Register_btn.click();
		homePage.SuccessfullyRegistered_txt.isDisplayed();
	}

	@Test(priority = 2)
	public void adminRegister() throws InterruptedException {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.AdminLogin_btn.click();
		loginPage.CreateAccount_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Admin | Signup"));
		assertEquals(driver.getTitle(), "ShoppersStack | Admin | Signup", "Wrong page title");
		adminSignupPage.First_Name_txtfield.sendKeys(faker.name().firstName());
		adminSignupPage.Last_Name_txtfield.sendKeys(faker.name().lastName());
		adminSignupPage.Gender_Male_radiobtn.click();
		adminSignupPage.Phone_No_txtfield.sendKeys(faker.phoneNumber().phoneNumber());
		adminSignupPage.Email_Address_txtfield.sendKeys(faker.internet().emailAddress());
		adminSignupPage.Password_txtfield.sendKeys("Test@123");
		adminSignupPage.Confirm_Password_txtfield.sendKeys("Test@123");
		Select countryDropdown= new Select(adminSignupPage.Country_dropdown);
		countryDropdown.selectByValue("India");
		Select stateDropdown= new Select(adminSignupPage.State_dropdown);
		stateDropdown.selectByValue("Karnataka");
		Select cityDropdown= new Select(adminSignupPage.City_dropdown);
		cityDropdown.selectByValue("Bengaluru");
		adminSignupPage.Register_btn.click();
		homePage.Profile_Created_Successfully_txt.isDisplayed();
	}
}
