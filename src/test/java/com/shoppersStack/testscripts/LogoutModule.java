package com.shoppersStack.testscripts;

import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class LogoutModule  extends BaseClass{
LoginModule loginModule = new LoginModule();
@Test()
public void Logout(){
	loginModule.shopperLogin();
	
}

}
