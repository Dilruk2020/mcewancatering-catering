package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element = null;
	
	public static WebElement buttonLogin(WebDriver driver) {
		
		element = driver.findElement(By.linkText("Login"));
		return element;
		
	}
	
	public static WebElement textboxEmail(WebDriver driver) {
		element = driver.findElement(By.id("reg_email"));
		return element;
	}
	
	public static WebElement textboxPassword(WebDriver driver) {
		element = driver.findElement(By.id("reg_password"));
		return element;
	}
	public static WebElement buttonRegister(WebDriver driver) {
		element = driver.findElement(By.name("register"));
		return element;
	}
	
	

}
