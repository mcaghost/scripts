package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParisWikipedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		WebElement Searchtxt=driver.findElement(By.name("q"));
		Searchtxt.sendKeys("Paris");
		
		WebElement searchBtn=driver.findElement(By.name("btnK"));
		searchBtn.submit();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Paris");
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		


		
		
	}

}
