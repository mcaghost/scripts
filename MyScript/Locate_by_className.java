package myscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_by_className {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\selenium_setup\\chromedriver.exe");
		//create webdriver instance
		WebDriver driver = new ChromeDriver();
		
		//navigate to google.com 
		driver.get("https://demo.guru99.com/test/facebook.html");

		List <WebElement> list = driver.findElements(By.className("inputtext"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+". "+list.get(i).getAttribute("name"));
		}
		list.get(0).sendKeys("abcd@gmail.com");
		list.get(1).sendKeys("abcdefghij");
		//driver.quit();
	}

}
