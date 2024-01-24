package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BorwserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		WebElement Searchtxt=driver.findElement(By.name("q"));
		
		//getTitle
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Paris");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();//it close the tab
		driver.quit();//it close entire browser





	}

}
