package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(@class,'BaseBadge-badge MuiBadge-badge MuiBadge-standard MuiBadge-anchorOriginBottomRight MuiBadge-anchorOriginBottomRightCircular MuiBadge-overlapCircular css-1mupj9l')])[2]")
	public WebElement uploadImage_btn;
	
	@FindBy(xpath = "//h3[.='Add Profile Photo']")
	public WebElement addProfilePhoto_btn;
	
	@FindBy(xpath = "//input[@accept=\"image/*\" and @type=\"file\"]")
	public WebElement chooseFile_btn;
	
	@FindBy(xpath = "//button[.='upload']")
	public WebElement upload_btn;
		
}
