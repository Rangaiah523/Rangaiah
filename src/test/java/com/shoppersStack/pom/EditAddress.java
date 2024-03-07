package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shoppersStack.generic.BaseClass;

public class EditAddress extends BaseClass {
@FindBy(xpath = "(//*[local-name()='svg' and @id=\"editaddress_fl\"])[1]")
public WebElement editIcon;

@FindBy(xpath = "//h1[text()='Update Address']")
public WebElement updateAddressText;

@FindBy(xpath = "//button[@id=\"Update Address\"]")
public WebElement updateAddress_Button;

//Office

@FindBy(xpath = "//h4[text()='Office']/../../../..//*[local-name()='svg' and @id=\"editaddress_fl\"]")
public WebElement editOfficeAddressIcon;

public EditAddress (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
