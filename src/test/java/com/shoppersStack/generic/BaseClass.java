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
import com.shoppersStack.pom.HomePage;
import com.shoppersStack.pom.LoginPage;
import com.shoppersStack.pom.ShopperSignupPage;
import com.shoppersStack.pom.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Faker faker;
	public static String gender;
	public static LoginPage loginPage;
	public static WelcomePage welcomePage;
	public static HomePage homePage;
	public static ShopperSignupPage shopperSignupPage;
	

	@BeforeTest
	public void LaunchApplication() throws IOException {

		driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.manage().window().maximize();
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("./src/test/resources/Credentials.json");
		properties.load(file);
		String url = properties.getProperty("URL");
		String expectedTitle = properties.getProperty("WelcomePageTitle");
		driver.get(url);
		assertEquals(driver.getTitle(), expectedTitle, "Title is Wrong");

		// Faker Class
		faker = new Faker(new Locale("en-IND"));
		
		// Page Initialization
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		shopperSignupPage = new ShopperSignupPage(driver);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
