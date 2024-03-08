package com.shoppersStack.testscripts;

import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class End_To_EndModule extends BaseClass{
	
	@Test
	public void orderProduct() throws InterruptedException {
		loginModule.shopperLogin();
		
	}
}
