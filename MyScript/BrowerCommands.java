package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowerCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Paris");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.close();//close the tab
		driver.quit();//closes the window
	}

}
