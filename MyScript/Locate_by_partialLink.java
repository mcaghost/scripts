package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_by_partialLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\selenium_setup\\chromedriver.exe");
		//create webdriver instance
		WebDriver driver = new ChromeDriver();
		
		//navigate to google.com
		driver.get("https://www.google.com");
		
		//locate hyperlink images using PartiallinkText
		WebElement img = driver.findElement(By.partialLinkText("Ima"));
		img.click();
		
		driver.quit();
	}

}
