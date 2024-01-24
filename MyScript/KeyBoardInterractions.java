package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardInterractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//
		driver.get("https://demo.guru99.com/test/login.html");
	
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("passwd"));
		
		Actions builder = new Actions(driver);	
		//pressing shift key
		builder.keyDown(email, Keys.SHIFT).sendKeys("sumit");
		
		//release shift key
		builder.keyUp(email, Keys.SHIFT);
		builder.sendKeys(pass, "sumit");
		builder.perform();
	}

}
