package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionOnElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set path to your browser driver
		//set path of gekodriver
				System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
				
				//creating instance of web driver
				WebDriver driver = new FirefoxDriver(); 
				//navigate to the webpage
				driver.get("https://demo.guru99.com/test/selenium-xpath.html");
				
				WebElement userid = driver.findElement(By.name("uid"));
				System.out.println(userid.getAttribute("name"));
				//firstname.sendKeys("Sumit");
				
				System.out.println(userid.getCssValue("FONT_FAMILY"));
				System.out.println(userid.getCssValue("background-color"));
				
				System.out.println(userid.getLocation());
				
				//print the size of userid txtbox
				System.out.println(userid.getSize());
				
				System.out.println(userid.getTagName());
				
				//boolean
				System.out.println(userid.isDisplayed());
				System.out.println(userid.isEnabled());
	}

}
