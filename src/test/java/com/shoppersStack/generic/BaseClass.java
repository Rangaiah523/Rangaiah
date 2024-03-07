package com.shoppersStack.generic;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Locale;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.github.javafaker.Faker;
import com.shoppersStack.pom.AccountSettings;
import com.shoppersStack.pom.HomePage;
import com.shoppersStack.pom.LoginPage;
import com.shoppersStack.pom.MyAddress;
import com.shoppersStack.pom.ShopperSignupPage;
import com.shoppersStack.pom.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// Driver
	public static WebDriver driver = WebDriverManager.chromedriver().create();
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

<<<<<<< HEAD
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Faker faker;
	public static String gender;
	public static LoginPage loginPage;
	public static WelcomePage welcomePage;
	public static HomePage homePage;
	public static ShopperSignupPage shopperSignupPage;
	public static MyAddress myAddress;
	
=======
	// Faker
	public static Faker faker = new Faker(new Locale("en-IND"));

	// Page Initialization
	public static LoginPage loginPage = new LoginPage(driver);
	public static WelcomePage welcomePage = new WelcomePage(driver);
	public static HomePage homePage = new HomePage(driver);
	public static ShopperSignupPage shopperSignupPage = new ShopperSignupPage(driver);
	public static MyAddress myAddress = new MyAddress(driver);
	public static AccountSettings accountSettings = new AccountSettings(driver);
>>>>>>> branch 'master' of https://github.com/Rangaiah523/Rangaiah

	@BeforeTest
	public void LaunchApplication() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("./src/test/resources/Credentials.json");
		properties.load(file);
		String url = properties.getProperty("URL");
		String expectedTitle = properties.getProperty("WelcomePageTitle");
		driver.get(url);
		assertEquals(driver.getTitle(), expectedTitle, "Title is Wrong");

<<<<<<< HEAD
		// Faker Class
		faker = new Faker(new Locale("en-IND"));
		
		// Page Initialization
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		shopperSignupPage = new ShopperSignupPage(driver);
		myAddress = new MyAddress(driver);

=======
>>>>>>> branch 'master' of https://github.com/Rangaiah523/Rangaiah
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
