package com.shoppersStack.testscripts;

import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;
import com.shoppersStack.pom.MyProfilePage;

public class MyProfile extends BaseClass {
	public MyProfilePage mpp=new MyProfilePage(driver);
	
	@Test
	public void editAddress() {
		LoginModule lm=new LoginModule();
		lm.shopperLogin();
		mpp.accountSettings.click();
		mpp.profile.click();
		mpp.editProfile.click();
		mpp.firstNameField.clear();
		mpp.firstNameField.sendKeys(faker.name().firstName());
		mpp.submitButton.click();
		driver.switchTo().alert().accept();
		mpp.accountSettings.click();
		mpp.logoutLink.click();
	}
}
