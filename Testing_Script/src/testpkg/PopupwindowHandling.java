package testpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupwindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Full stack training\\selenium_scripts\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("file:///D:/Full%20stack%20training/selenium_scripts/Htmlfiles/flight_reservation.html");
		//handling Simple Alert
		System.out.println("Titale of main Window= "+driver.getTitle());
		System.out.println("Titale of child Window= "+driver.getWindowHandle());
		
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		hotels.click();
		
		Set<String>handles=driver.getWindowHandles();
		
		for(String windowHandle: handles) {
			if(!windowHandle.equals(handles)) {
				driver.switchTo().window(windowHandle);
				System.out.println("Titale of main Window= "+driver.getTitle());
				System.out.println("Titale of child Window= "+driver.getWindowHandle());
			}
			
			
		}
		WebElement heading=driver.findElement(By.id("sampleHeading"));
		System.out.println("heading inside child window is "+heading.getTagName());
		Thread.sleep(3000);
		driver.close();
		

		

	}

}
