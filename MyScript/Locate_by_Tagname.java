package myscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate_by_Tagname {

	public static void main(String[] args) {
System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//navigate to google.com
		driver.get("https://www.google.com");
		
		List <WebElement> list = driver.findElements(By.tagName("input"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+". "+list.get(i).getAttribute("name"));
		}
		
		driver.quit();
	}

}
