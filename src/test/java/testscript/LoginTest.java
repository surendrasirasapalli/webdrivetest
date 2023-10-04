package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver .manage() .window().maximize();
	driver.get("https://the-internet.herokuapp.com/login");
	driver.findElement(By.id("username")).sendKeys("tomsith");
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.tagName("button")).click();
	driver.findElement(By.className("radius")).click();
	driver.findElement(By.linkText("Elemental Selenium")).click();
	driver.findElement(By.partialLinkText("Elemental")).click();
	
	}
}
