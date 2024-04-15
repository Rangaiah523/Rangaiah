package testing;

import java.time.Duration;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	public static WebDriver driver;
	@org.testng.annotations.DataProvider(name="balaji")
	public Object[][] getData() {
		Object[][] data = {{"user1@gmail.com","Password@123"},{"user2@gmail.com","Password@234"},{"user3@gmail.com","Password@345"}};
		TreeMap map = new TreeMap();
		map.put("user1@gmail.com", "Password@123");
		map.put("user2@gmail.com", "Password@234");
		map.put("user3@gmail.com", "Password@345");
		map.put("user4@gmail.com", "Password@456");
		TreeMap map2=new TreeMap();
		map2.putAll(map);
		return data;
	}
	
@BeforeClass
@Parameters("browser")
public void OpenBrowser(String Browser) {
	
	if (Browser.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	}
	
	if (Browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.get("https://shoppersstack.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//button[text()='Login']")).click();
}

@Test(dataProvider = "balaji")
public void login(String UserName, String Password) {
	WebElement emailid = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
	emailid.clear();
	emailid.sendKeys(UserName);
	WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
	password.clear();
	password.sendKeys(Password);
	
}
}
