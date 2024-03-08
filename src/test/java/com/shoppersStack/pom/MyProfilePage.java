package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Upload Photo
	@FindBy(xpath = "(//span[contains(@class,'BaseBadge-badge MuiBadge-badge MuiBadge-standard MuiBadge-anchorOriginBottomRight MuiBadge-anchorOriginBottomRightCircular MuiBadge-overlapCircular css-1mupj9l')])[2]")
	public WebElement uploadPhoto_btn;

	@FindBy(xpath = "//h3[.='Add Profile Photo']")
	public WebElement addProfilePhoto_txt;

	@FindBy(xpath = "//input[@accept=\"image/*\" and @type=\"file\"]")
	public WebElement chooseFile_btn;

	@FindBy(xpath = "//button[.='upload']")
	public WebElement upload_btn;

	// Edit Profile
	@FindBy(xpath = "//button[contains(.,'Edit Profile')]")
	public WebElement editProfile_btn;

	@FindBy(xpath = "//h2[contains(.,'Edit Profile')]")
	public WebElement editProfile_txt;

	@FindBy(xpath = "//input[@id='First Name']")
	public WebElement firstName_txtfield;

	@FindBy(xpath = "//input[@id='Last Name']")
	public WebElement lastName_txtfield;

	@FindBy(id = "submit")
	public WebElement submit_btn;
	
	@FindBy(id = "City")
	public WebElement city_dropdown;
}