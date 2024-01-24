package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///D:/Full%20stack%20training/selenium_scripts/HTML_files/Selectable.html");
		
		WebElement tile3=driver.findElement(By.name("three"));
		tile3.getLocation();
		WebElement tile2=driver.findElement(By.name("two"));
		tile2.getLocation();

		
		Actions builder=new Actions(driver);
		
		builder.clickAndHold(tile3).release(tile2);
		builder.perform();
		

	}

}
