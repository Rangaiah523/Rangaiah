package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
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
		js.executeScript("document.querySelector(\"body > div.MuiModal-root.css-8ndowl > div.MuiBox-root.css-18zuygp > form > div > input\").click()");
		
		String jse = "arguments[0].type='file'";
		((JavascriptExecutor)driver).executeScript(jse, js);
		js.sendKeys("absolute_path_of_the_file_to_be_uploaded");
		
		myProfilePage.chooseFile_btn.sendKeys("./src/test/resources/Profile_Image.jpg");
		
		wait.until(ExpectedConditions.elementToBeClickable(myProfilePage.upload_btn));
		myProfilePage.upload_btn.isEnabled();
		myProfilePage.upload_btn.click();

		Thread.sleep(10000);
	}
}
