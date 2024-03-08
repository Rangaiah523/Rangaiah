package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class VocherModule extends BaseClass{
 
	@Test
	public void GenerateVocher() throws InterruptedException {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		actions.scrollToElement(homePage.vocher_Button).perform();
		homePage.vocher_Button.click();
		Set<String> handle = driver.getWindowHandles();
		for (String string : handle) {
			driver.switchTo().window(string);
		}
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		vocherpage.advance_Button.click();
		actions.scrollToElement(vocherpage.proceed_Button).perform();
		vocherpage.proceed_Button.click();
		vocherpage.emailid_Textfield.sendKeys("testing1@gmail.com");
		vocherpage.password_Textfield.sendKeys("Test@123");
		vocherpage.login_Button.click();
		
	}
}
