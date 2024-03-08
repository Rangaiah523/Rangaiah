package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class MyProfileModule extends BaseClass {

	@Test(priority = 1)
	public void uploadProfileImage() {
		new LoginModule().shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Profile"));
		assertEquals(driver.getTitle(), "ShoppersStack | Profile", "Page title is wrong");
		myProfilePage.uploadPhoto_btn.click();
		myProfilePage.addProfilePhoto_txt.isDisplayed();
		File file = new File("src\\test\\resources\\Profile_Image.jpg");
		myProfilePage.chooseFile_btn.sendKeys(file.getAbsolutePath());
		wait.until(ExpectedConditions.elementToBeClickable(myProfilePage.upload_btn));
		myProfilePage.upload_btn.isEnabled();
		myProfilePage.upload_btn.click();
		homePage.Success_txt.isDisplayed();
	}

	@Test(priority = 2)
	public void editprofile() {
		new LoginModule().shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Profile"));
		assertEquals(driver.getTitle(), "ShoppersStack | Profile", "Page title is wrong");
		myProfilePage.editProfile_btn.click();
		myProfilePage.editProfile_txt.isDisplayed();
		myProfilePage.firstName_txtfield.clear();
		myProfilePage.firstName_txtfield.sendKeys(faker.name().firstName());
		myProfilePage.lastName_txtfield.clear();
		myProfilePage.lastName_txtfield.sendKeys(faker.name().lastName());
		Select city = new Select(myProfilePage.city_dropdown);
		city.selectByValue("Bengaluru");
		myProfilePage.submit_btn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		String alertMessage = driver.switchTo().alert().getText();
		assertEquals(alertMessage, "Profile updated", "Alert message is wrong");
		driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Profile"));
		assertEquals(driver.getTitle(), "ShoppersStack | Profile", "Page title is wrong");
	}
}