package com.shoppersStack.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.shoppersStack.generic.BaseClass;

public class SearchModule extends BaseClass {
	@Test()
	public void SearchProducts() throws Throwable {
		welcomePage.Login_btn.click();
		AssertJUnit.assertEquals(driver.getTitle(), "ShoppersStack | Login", "Wrong page title");
		loginPage.Email_txtfield.sendKeys("testing1@gmail.com");
		loginPage.Password_txtfield.sendKeys("Test@123");
		loginPage.Login_btn.click();
		wait.until(ExpectedConditions.titleIs("ShoppersStack | Home"));
		Select select = new Select(homePage.category_Dropdown);
		select.selectByVisibleText("electronics");
		wait.until(ExpectedConditions.elementToBeClickable(homePage.searchTextField));
		homePage.searchTextField.sendKeys("Books");
		homePage.Search_Icon.click();
		Thread.sleep(5000);
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/search-products/Books/electronics",
				"Page is Wrong");
	}
}