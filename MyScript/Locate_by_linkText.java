package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_by_linkText {

	public static void main(String[] args) {
		//set path to your browser driver
				System.setProperty("webdriver.chrome.driver","H:\\selenium_setup\\chromedriver.exe");
				//create webdriver instance
				WebDriver driver = new ChromeDriver();
				
				//navigate to google.com
				driver.get("https://www.google.com");
				
				//locate hyperlink images using linkText
				WebElement images = driver.findElement(By.linkText("Images"));
				images.click();
	}

}
