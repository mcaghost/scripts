package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set path of chromedriver
System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com");
				
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.sendKeys("FAMT");
				
				WebElement searchButton = driver.findElement(By.name("btnK"));
				searchButton.submit();
	}

}
