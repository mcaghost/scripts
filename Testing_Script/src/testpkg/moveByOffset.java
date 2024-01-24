package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class moveByOffset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///D:/Full%20stack%20training/selenium_scripts/HTML_files/Selectable.html");
		
		WebElement tile3=driver.findElement(By.name("three"));
		tile3.getLocation();
		System.out.println("X coordinate: "+tile3.getLocation().x+" Y coordinate: "+tile3.getLocation().y);
		
		Actions builder=new Actions(driver);
		
		builder.moveByOffset(tile3.getLocation().x+1,tile3.getLocation().y+1).click();
		builder.perform();
		
		WebElement tile11=driver.findElement(By.name("eleven"));
		builder.click(tile11);
		builder.perform();

		
		
		
	}

}
