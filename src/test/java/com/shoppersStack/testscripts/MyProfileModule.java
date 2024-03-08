package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class MyProfileModule extends BaseClass {

	@Test(priority = 1)
	public void uploadProfileImage() throws InterruptedException {
		new LoginModule().shopperLogin();
		homePage.accountSettings_btn.click();
		homePage.myProfile_button.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Profile"));
		assertEquals(driver.getTitle(), "ShoppersStack | Profile", "Page title is wrong");
		myProfilePage.uploadImage_btn.click();
		myProfilePage.addProfilePhoto_btn.isDisplayed();
		File file = new File("src\\test\\resources\\Profile_Image.jpg");
		myProfilePage.chooseFile_btn.sendKeys(file.getAbsolutePath());
		wait.until(ExpectedConditions.elementToBeClickable(myProfilePage.upload_btn));
		myProfilePage.upload_btn.isEnabled();
		myProfilePage.upload_btn.click();
		homePage.Success_txt.isDisplayed();
	}
}