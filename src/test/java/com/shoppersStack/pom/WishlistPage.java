package com.shoppersStack.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppersStack.generic.BaseClass;

public class WishlistPage extends BaseClass {

	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	String txt = "APPLE 2021 Macbook Pro M1 Max";

	public WebElement wishList_btn() {
		return driver.findElement(By.xpath("//span[contains(.,'" + txt + "')]/../..//*[local-name()='svg' and @name='addToWishlist']"));
	}

	public WebElement wishList_product_txt() {
		return driver.findElement(By.xpath("//h2[contains(.,'" + txt + "')]"));
	}
	
	public WebElement removeFromWishlist_btn() {
		return driver.findElement(By.xpath("//h2[contains(.,'" + txt + "')]/..//button[.='remove from wishlist?']"));
	}
	
	@FindBy(xpath="//h1[.='Your wish list is empty please go back and add some products']")
	public WebElement wishlistIsEmpty_txt;
}