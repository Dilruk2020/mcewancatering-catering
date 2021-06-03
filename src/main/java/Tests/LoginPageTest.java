package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Pages.LoginPage;



public class LoginPageTest {
	public static WebDriver driver;
@BeforeTest
	public void mcewancateringLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilruk\\Documents\\Dilruk\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://staging.mcewancatering.com/");
			
	}
	
@Test
	public void Login() {
		LoginPage.buttonLogin(driver).click();
		LoginPage.textboxEmail(driver).sendKeys("test123@gmail.com");
		LoginPage.textboxPassword(driver).sendKeys("Dilruk123");
		LoginPage.buttonRegister(driver).click();
	}

}
