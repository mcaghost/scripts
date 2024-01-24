package testpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///D:/Full%20stack%20training/selenium_scripts/HTML_files/DoubleClick.html");
		
		WebElement tile3=driver.findElement(By.name("dblClick"));
		Actions builder=new Actions(driver);
		
		builder.doubleClick(tile3);
		builder.perform();
		
		Alert simpleAlert=driver.switchTo().alert();

		Thread.sleep(3000);

		simpleAlert.accept();
			

	}

}
