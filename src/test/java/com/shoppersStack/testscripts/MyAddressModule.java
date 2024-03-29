package com.shoppersStack.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class MyAddressModule extends BaseClass {
	
	//Add Home Address
	@Test(priority = 1)
	public void addAddress() throws Throwable {
		welcomePage.Login_btn.click();
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
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
		Select select = new Select(addAddress.contry_Dropdown);
		select.selectByVisibleText("India");
		Select select2 = new Select(addAddress.state_Dropdown);
		select2.selectByVisibleText("Karnataka");
		Select select3 = new Select(addAddress.cityDropdown);
		select3.selectByVisibleText("Bengaluru");
		addAddress.pincodeTextfield.sendKeys("560010");
		addAddress.phoneNumber_Textfield.sendKeys("7259987990");
		addAddress.addAddress_Button.click();
	}
	
	
	//Edit Home Address
	@Test(priority = 2)
	public void EditAddress() throws Throwable {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
		accountSettings.myAddress_Button.click();
		editAddress.editIcon.click();
		boolean validation = editAddress.updateAddressText.isDisplayed();
		assertEquals(validation, true);
		String name = faker.name().fullName();
		addAddress.name_Textfield.sendKeys(name);
		addAddress.landMark_Textfield.sendKeys("South End Circle ");
		addAddress.pincodeTextfield.sendKeys("560010");
		editAddress.updateAddress_Button.click();
}
	
	//Add Office Address
	@Test(priority = 3)
	public void addOfficeAddress() throws Throwable {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
		accountSettings.myAddress_Button.click();
		assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/my-profile/my-addresses",
				"Url is MisMatched");
		myAddress.Addaddress_Button.click();
		assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/addressform", "Url is MisMatched");
		addAddress.officeRadioButton.click();
		String firstname = faker.name().firstName();
		addAddress.name_Textfield.sendKeys(firstname);
		String buildingNumber = faker.address().buildingNumber();
		addAddress.HouseOffice_TextField.sendKeys(buildingNumber);
		String Streetinfo = faker.address().streetName();
		addAddress.strretInfo_Textfield.sendKeys(Streetinfo);
		addAddress.landMark_Textfield.sendKeys("Jaya Nagara Circle");
		Select select = new Select(addAddress.contry_Dropdown);
		select.selectByVisibleText("India");
		Select select2 = new Select(addAddress.state_Dropdown);
		select2.selectByVisibleText("Karnataka");
		Select select3 = new Select(addAddress.cityDropdown);
		select3.selectByVisibleText("Bengaluru");
		addAddress.pincodeTextfield.sendKeys("560010");
		addAddress.phoneNumber_Textfield.sendKeys("7259987990");
		addAddress.addAddress_Button.click();
		Thread.sleep(5000);
	}
	
	//Edit Office Address
	@Test(priority = 4)
	public void EditAddressOffice() throws Throwable {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
		accountSettings.myAddress_Button.click();
		editAddress.editOfficeAddressIcon.click();
		boolean validation = editAddress.updateAddressText.isDisplayed();
		assertEquals(validation, true);
		wait.until(ExpectedConditions.elementToBeClickable(addAddress.landMark_Textfield));
		addAddress.landMark_Textfield.clear();
		addAddress.landMark_Textfield.sendKeys("Indiqube South End Circle Bangalore");
		wait.until(ExpectedConditions.elementToBeClickable(addAddress.landMark_Textfield));
		addAddress.pincodeTextfield.clear();
		addAddress.pincodeTextfield.sendKeys("560010");
		wait.until(ExpectedConditions.elementToBeClickable(editAddress.updateAddress_Button));
		editAddress.updateAddress_Button.click();
		}
}