package myscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//
		driver.get("file:///C:/Users/HP/Downloads/HTML_files/DoubleClick.html");
		
		//locate title 3
			WebElement btn = driver.findElement(By.name("dblClick"));
			System.out.print("X coordinate: "+btn.getLocation().x+" Y coordinate: "+btn.getLocation().y);
			
			//instantiate actions class object
			Actions builder = new Actions(driver);	
			
			builder.moveToElement(btn).doubleClick();
			builder.perform();
			
			Thread.sleep(3000);
			
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
	}

}
