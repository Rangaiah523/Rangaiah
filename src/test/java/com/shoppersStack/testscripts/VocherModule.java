package com.shoppersStack.testscripts;

import static org.testng.Assert.assertEquals;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import org.checkerframework.checker.signature.qual.FullyQualifiedName;
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
		boolean Verify = couponGeneratorPage.couponGenerator_Text.isDisplayed();
		System.out.println(Verify);
		String emailAddress = faker.internet().emailAddress();
		couponGeneratorPage.email_Textfield.sendKeys(emailAddress);

		String fullName = faker.name().fullName();
		couponGeneratorPage.fullName_Textfield.sendKeys(fullName);
		couponGeneratorPage.cost_Textfiled.sendKeys("10000");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-00yyyyHH:mm");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now)); 
		   couponGeneratorPage.startDate_Textfield.sendKeys(dtf.format(now));
		   couponGeneratorPage.endDate_TextFiled.sendKeys("01-12-00202412:00PM");
		   couponGeneratorPage.applicationName_Dropdown.click();
		   couponGeneratorPage.shoppingKart_Button.click();
		   couponGeneratorPage.vochercount_Textfiled.sendKeys("15");
		   couponGeneratorPage.generate_Button.click();
		   
			Thread.sleep(5000);
	}
}
