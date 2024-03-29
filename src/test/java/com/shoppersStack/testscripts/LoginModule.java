package com.shoppersStack.testscripts;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import com.shoppersStack.generic.BaseClass;

@Listeners(com.shoppersStack.generic.ListenerImplementation.class)
public class LoginModule extends BaseClass {
	@Test
	public void shopperLogin() throws EncryptedDocumentException, IOException {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		//Data Providers
		FileInputStream fis=new FileInputStream("C:/Users/User/git/Rangaiah/src/test/resources/Testing Datas/Test Data.xlsx");
		String email=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		loginPage.Email_txtfield.sendKeys(email);
		String pass=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		loginPage.Password_txtfield.sendKeys(pass);
		
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		assertEquals(driver.getTitle(), "ShoppersStack | Home", "Wrong page title");
		driver=null;
	}

	@Test
	public void adminLogin() throws EncryptedDocumentException, IOException {
		welcomePage.Login_btn.click();
		assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.AdminLogin_btn.click();
		FileInputStream fis=new FileInputStream(".test\\resources\\Test Data\\Test Data.xlsx");
		String email=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		loginPage.Email_txtfield.sendKeys(email);
		loginPage.Password_txtfield.sendKeys(password);
		loginPage.Login_btn.click();
		homePage.home_link.isDisplayed();
		driver=null;
	}
}