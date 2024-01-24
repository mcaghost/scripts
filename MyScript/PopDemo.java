package myscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium_setup\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//create webdriver instance
		WebDriver driver = new ChromeDriver();
		//navigate to the webpage
		driver.get("file:///D:/Htmlfiles/flight_reservation.html");
		
		System.out.println("Title of main window = "+driver.getTitle());
		System.out.println("Main windows handle or id = "+driver.getWindowHandle());
		
		WebElement hotels = driver.findElement(By.linkText("Hotels"));
		hotels.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String windowHandle : handles) {
			if(!windowHandle.equals(handles)) {
				driver.switchTo().window(windowHandle);
				System.out.println("Title of child window = "+driver.getTitle());
				System.out.println("Id of child window = "+driver.getWindowHandle());
			}

		}

		WebElement heading = driver.findElement(By.id("sampleHeading"));
			System.out.println("Heading inside child is "+heading.getText());
			Thread.sleep(3000);
			driver.close();
	
	}

}
