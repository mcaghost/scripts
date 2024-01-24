package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//
		driver.get("file:///C:/Users/HP/Downloads/HTML_files/Selectable.html");
		
		//locate title 3
		WebElement three = driver.findElement(By.name("three"));
		
		System.out.println("X coordinate: "+three.getLocation().x+" Y coordinate: "+three.getLocation().y);
		
		//instantiate actions class object
		Actions builder = new Actions(driver);
		
		//move mouse cursor to tile 3 //building action //group of actions to be perform
		builder.moveByOffset(three.getLocation().x + 1, three.getLocation().y + 1).click();
		
		builder.perform();
		
		Thread.sleep(3000);
		
		//click on webelement method
		WebElement eleven = driver.findElement(By.name("eleven"));
		System.out.println("X coordinate: "+eleven.getLocation().x+" Y coordinate: "+eleven.getLocation().y);
		builder.click(eleven);
		builder.perform();
		
	}

}
