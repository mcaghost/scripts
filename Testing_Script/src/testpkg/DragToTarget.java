package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///D:/Full%20stack%20training/selenium_scripts/HTML_files/DragAndDrop.html");
		
		WebElement click=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));

		
		Actions builder=new Actions(driver);
		builder.dragAndDrop(click, drop);
		//builder.dragAndDropBy(click,drop.getLocation().x,drop.getLocation().y); // or use this  
		builder.perform();
	}

}
