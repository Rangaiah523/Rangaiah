package com.shoppersStack.testscripts;

import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;
import com.shoppersStack.pom.MyProfilePage;

public class MyProfile extends BaseClass {
	public MyProfilePage mpp=new MyProfilePage(driver);
	
	@Test()
	public void editAddress() throws InterruptedException {
		LoginModule lm=new LoginModule();
		lm.shopperLogin();
		mpp.accountSettings.click();
		mpp.profile.click();
//		https://shoppersstack.com/my-profile/my-profile-info
		mpp.editProfile.click();
		mpp.firstNameField.clear();
		Thread.sleep(3000);
		mpp.firstNameField.sendKeys(faker.name().firstName());
		mpp.submitButton.click();
		driver.switchTo().alert().accept();
		mpp.accountSettings.click();
		mpp.logoutLink.click();
	}
}
