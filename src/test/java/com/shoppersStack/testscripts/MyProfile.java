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
	}
}
