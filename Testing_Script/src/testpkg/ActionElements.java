package testpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		WebElement bike=driver.findElement(By.cssSelector("input[value='Bike']"));//usign value
		WebElement car=driver.findElement(By.cssSelector("input[value='Car']"));//usign value
		WebElement boat=driver.findElement(By.cssSelector("input[value='Boat']"));//usign value
		boat.click();
		System.out.println(bike.isSelected());
		System.out.println(car.isSelected());
		System.out.println(boat.isSelected());
		
		Select car_type=new Select(driver.findElement(By.tagName("select")));
		
		//by visible text
		car_type.selectByVisibleText("Saab");
		Thread.sleep(3000);
		car_type.selectByValue("Russia");
		car_type.selectByIndex(2);
		
		Select country=new Select(driver.findElement(By.name("FromLB")));
		System.out.println(country.isMultiple());
		if(country.isMultiple())
		{
			country.selectByIndex(2);
			country.selectByIndex(3);
			country.selectByIndex(4);

		}
		else
		{
			System.out.println("Does not allow multiple selections");
		}

		

		



	}

}
