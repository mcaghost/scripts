package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/login.html");
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("passwd"));
		Actions builder=new Actions(driver);
		builder.keyDown(email,Keys.SHIFT).sendKeys("abhishek@gmail.com");
		builder.keyUp(email,Keys.SHIFT);
		builder.keyDown(pass,Keys.SHIFT).sendKeys("abhishek@gmail.com");
		builder.keyUp(pass,Keys.SHIFT);
		builder.perform();
		

	}

}
