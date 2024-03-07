package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.tokens.StreamEndToken;

import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class MyAddressModule extends BaseClass {
	@Test
	public void addAddress() throws Throwable {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		homePage.profile_Button.click();
		homePage.accountSettings_Button.click();
		accountSettings.myAddress_Button.click();
		assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/my-profile/my-addresses",
				"Url is MisMatched");
		myAddress.Addaddress_Button.click();
		assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/addressform", "Url is MisMatched");
		String firstname = faker.name().firstName();
		addAddress.name_Textfield.sendKeys(firstname);
		String buildingNumber = faker.address().buildingNumber();
		addAddress.HouseOffice_TextField.sendKeys(buildingNumber);
		String Streetinfo = faker.address().streetName();
		addAddress.strretInfo_Textfield.sendKeys(Streetinfo);
		addAddress.landMark_Textfield.sendKeys("Jaya Nagara Circle");
		Thread.sleep(5000);
		
		

	}

}