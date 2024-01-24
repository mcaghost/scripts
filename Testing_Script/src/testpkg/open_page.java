package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class open_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set path of geckodriver
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//creating instance of web driver
		driver.get("https://www.google.com");//navigate to webpage
		
		WebElement searchBox=driver.findElement(By.name("q"));//created web elements instance
		searchBox.sendKeys("FAMT");
		
		WebElement Button=driver.findElement(By.name("btnK"));//created web elements instance
		Button.submit();
		
	
		
	}

}
