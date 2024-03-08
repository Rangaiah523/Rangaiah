package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class LogoutModule  extends BaseClass{
LoginModule loginModule = new LoginModule();
@Test()
public void Logout(){
	loginModule.shopperLogin();
	homePage.profile_Button.click();
	wait.until(ExpectedConditions.elementToBeClickable(homePage.logout_Button));
	homePage.logout_Button.click();
	assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/", "Logout is UnSccessFul");
	
	
}

}
