package myscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionElement {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
			System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
			
			List<WebElement> userid=driver.findElements(By.name("vehicle"));
			
			WebElement bike=driver.findElement(By.cssSelector("input[value='Bike']"));//usign value
			WebElement car=driver.findElement(By.cssSelector("input[value='Car']"));//usign value
			WebElement boat=driver.findElement(By.cssSelector("input[value='Boat']"));//usign value
			boat.click();
			car.click();
			System.out.println(bike.isSelected());
			System.out.println(car.isSelected());
			System.out.println(boat.isSelected());
			
			Select cartype=new Select(driver.findElement(By.tagName("select")));
			
			//by visible text
			cartype.selectByVisibleText("Saab");
			Thread.sleep(3000);
			cartype.selectByValue("Russia");
			cartype.selectByIndex(0);
			
		}

	}