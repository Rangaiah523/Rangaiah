package com.shoppersStack.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.shoppersStack.generic.BaseClass;

public class WishlistPage extends BaseClass {
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	static String dynamic_wishList_btn = "APPLE 2021 Macbook Pro M1 Max";

	public static WebElement wishList_btn = driver.findElement(By.xpath("//span[contains(.,'" + dynamic_wishList_btn + "')]/../..//*[local-name()=\"svg\" and @name=\"addToWishlist\"]"));

//	public static WebElement productName_txt = driver.findElement(By.xpath("//h2[contains(.,'"+dynamic_wishList_btn+"')]"));

}