package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.shoppersStack.pom.Welcome;

import generic.BaseClass;

public class LoginModule extends BaseClass {
	@Test
	public void shopperLogin() {
		Welcome w = new Welcome(driver);
		w.Login().click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		
	}

}