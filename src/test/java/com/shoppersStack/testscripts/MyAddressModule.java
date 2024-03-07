package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.shoppersStack.generic.BaseClass;
import com.shoppersStack.pom.AccountSettings;
import com.shoppersStack.pom.HomePage;
import com.shoppersStack.pom.LoginPage;
import com.shoppersStack.pom.MyAddress;
import com.shoppersStack.pom.WelcomePage;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class MyAddressModule  extends BaseClass{
@Test
public void addAddress() throws Throwable {
	WelcomePage welcomePage = new WelcomePage(driver);
	welcomePage.Login_btn.click();
	assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
	loginPage.Password_txtfield.sendKeys("Test@123");
	loginPage.Login_btn.click();
	wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
	assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
	HomePage homePage = new HomePage(driver);
	homePage.profile_Button.click();
	homePage.accountSettings_Button.click();
	AccountSettings accountSettings = new AccountSettings(driver);
	accountSettings.myAddress_Button.click();
	assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/my-profile/my-addresses" , "Url is MisMatched");
	MyAddress myAddress = new MyAddress(driver);
	myAddress.Addaddress_Button.click();
	assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/addressform", "Url is MisMatched");
	Faker faker = new Faker();
	
	
	
}

}

