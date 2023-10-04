package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkboxTest {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver .manage() .window().maximize();
	driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	WebElement chkbox = driver.findElement(By.id("isAgeselected"));
	if(chkbox.isSelected())
	{
		//To unselect
		chkbox.click();
	}
	else {
		//To select
		chkbox.click();
	}
	}
}
