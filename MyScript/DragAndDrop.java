package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//
		driver.get("file:///C:/Users/HP/Downloads/HTML_files/DragAndDrop.html");
	
			WebElement draggMe = driver.findElement(By.id("draggable"));
		
			WebElement dropHere = driver.findElement(By.id("droppable"));
			//instantiate actions class object
			Actions builder = new Actions(driver);	
			
			builder.dragAndDrop(draggMe, dropHere);
			builder.perform();
	}

}
