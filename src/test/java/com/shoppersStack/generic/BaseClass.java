package com.shoppersStack.generic;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void LaunchApplication() throws IOException {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("./src/test/resources/Credentials.json");
		properties.load(file);
		String url = properties.getProperty("URL");
		String expectedTitle = properties.getProperty("WelcomePageTitle");
		driver.get(url);
		assertEquals(driver.getTitle(), expectedTitle, "Title is Wrong");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
