package com.shoppersStack.generic;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Locale;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import com.github.javafaker.Faker;
import com.shoppersStack.pom.AccountSettings;
import com.shoppersStack.pom.AddAddress;
import com.shoppersStack.pom.AdminSignupPage;
import com.shoppersStack.pom.EditAddress;
import com.shoppersStack.pom.HomePage;
import com.shoppersStack.pom.LoginPage;
import com.shoppersStack.pom.MyAddress;
import com.shoppersStack.pom.MyProfilePage;
import com.shoppersStack.pom.ShopperSignupPage;
import com.shoppersStack.pom.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// Driver
	public static WebDriver driver= WebDriverManager.chromedriver().create();
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	public static  Robot robot;
	public static JavascriptExecutor js=(JavascriptExecutor)driver;
	
	// Faker
	public static Faker faker = new Faker(new Locale("en-IND"));

	// Page Initialization
	public static LoginPage loginPage = new LoginPage(driver);
	public static WelcomePage welcomePage = new WelcomePage(driver);
	public static HomePage homePage = new HomePage(driver);
	public static ShopperSignupPage shopperSignupPage = new ShopperSignupPage(driver);
	public static MyAddress myAddress = new MyAddress(driver);
	public static AccountSettings accountSettings = new AccountSettings(driver);
	public static AddAddress addAddress = new AddAddress(driver);
	public static AdminSignupPage adminSignupPage = new AdminSignupPage(driver);
	public static EditAddress editAddress = new EditAddress(driver);
	public static MyProfilePage myProfilePage = new MyProfilePage(driver);
	

	@BeforeMethod
	public void LaunchApplication() throws IOException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("./src/test/resources/Credentials.json");
		properties.load(file);
		String url = properties.getProperty("URL");
		String expectedTitle = properties.getProperty("WelcomePageTitle");
		driver.get(url);
		assertEquals(driver.getTitle(), expectedTitle, "Title is Wrong");
		robot = new Robot();
	}

//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//}
}
