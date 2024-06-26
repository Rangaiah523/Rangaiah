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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.github.javafaker.Faker;
import com.shoppersStack.pom.AccountSettings;
import com.shoppersStack.pom.AddAddress;
import com.shoppersStack.pom.AddToCartPage;
import com.shoppersStack.pom.AdminSignupPage;
import com.shoppersStack.pom.CouponGeneratorPage;
import com.shoppersStack.pom.EditAddress;
import com.shoppersStack.pom.HomePage;
import com.shoppersStack.pom.LoginPage;
import com.shoppersStack.pom.MyAddress;
import com.shoppersStack.pom.MyOrdersPage;
import com.shoppersStack.pom.MyProfilePage;
import com.shoppersStack.pom.MyWallet;
import com.shoppersStack.pom.PaymentPage;
import com.shoppersStack.pom.ShopperSignupPage;
import com.shoppersStack.pom.VocherPage;
import com.shoppersStack.pom.WelcomePage;
import com.shoppersStack.pom.WishlistPage;
import com.shoppersStack.testscripts.LoginModule;
import com.shoppersStack.testscripts.LogoutModule;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// Driver
	public static WebDriver driver = WebDriverManager.chromedriver().create();
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	public static Robot robot;
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	public static Actions actions = new Actions(driver);

	// Faker
	@SuppressWarnings("deprecation")
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
	public static AddToCartPage addToCart = new AddToCartPage(driver);
	public static PaymentPage paymentpage = new PaymentPage(driver);
	public static LoginModule loginModule = new LoginModule();
	public static LogoutModule logoutModule = new LogoutModule();
	public static MyProfilePage myProfilePage = new MyProfilePage(driver);
	public static VocherPage vocherpage = new VocherPage(driver);
	public static MyOrdersPage myOrderPage = new MyOrdersPage(driver);
	public static WishlistPage wishlistPage = new WishlistPage(driver);
	public static CouponGeneratorPage couponGeneratorPage = new CouponGeneratorPage(driver);
	public static MyWallet myWallet = new MyWallet(driver);

	@BeforeTest
	public void LaunchApplication() throws IOException, AWTException {
		while (driver != null) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			Properties properties = new Properties();
			FileInputStream file = new FileInputStream("./src/test/resources/Credentials.json");
			properties.load(file);
			String url = properties.getProperty("URL");
			String expectedTitle = properties.getProperty("WelcomePageTitle");
			driver.get(url);
			assertEquals(driver.getTitle(), expectedTitle, "Title is Wrong");
			robot = new Robot();
			break;
		}
	}
	
	
//	@AfterTest
//	public void Relaunch() throws IOException, AWTException {
//		if(driver==null) {
//			driver = WebDriverManager.chromedriver().create();
//			LaunchApplication();
//		}
//	}
}
