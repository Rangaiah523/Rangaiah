package com.shoppersStack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.shoppersStack.generic.BaseClass;

public class VocherPage extends BaseClass {

	
	@FindBy(xpath = "//button[@id=\"details-button\"]")
	public WebElement advance_Button;
	
	@FindBy(xpath = "//a[@id=\"proceed-link\"]")
	public WebElement proceed_Button;
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	public WebElement emailid_Textfield;
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	public WebElement password_Textfield;
	
	@FindBy(xpath = "//button[.=\"login\"]")
	public WebElement login_Button;
	
	
	public VocherPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
}
