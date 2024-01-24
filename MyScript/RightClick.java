package myscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//
		driver.get("file:///C:/Users/HP/Downloads/HTML_files/ContextClick.html");
	
			WebElement contextClick = driver.findElement(By.id("div-context"));
		
		
			//instantiate actions class object
			Actions builder = new Actions(driver);	
			
			builder.contextClick(contextClick);
			builder.perform();
			
			
			
			WebElement item4 = driver.findElement(By.id("ui-id-2"));
			Thread.sleep(3000);
			item4.click();

			Thread.sleep(3000);
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
	}

}
