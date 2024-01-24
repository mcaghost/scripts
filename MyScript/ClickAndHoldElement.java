package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//
		driver.get("file:///C:/Users/HP/Downloads/HTML_files/Selectable.html");
		
		//locate title 3
			WebElement three = driver.findElement(By.name("three"));
			System.out.print("\nTile 2:\nX coordinate: "+three.getLocation().x+" Y coordinate: "+three.getLocation().y);
				
		//locate title 2
			WebElement two = driver.findElement(By.name("two"));
			System.out.print("\nTile 3:\nX coordinate: "+two.getLocation().x+" Y coordinate: "+two.getLocation().y);
			
			//instantiate actions class object
			Actions builder = new Actions(driver);	
			
			builder.clickAndHold(three).release(two);
			
			builder.perform();
	}

}
