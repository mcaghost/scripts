package testpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///D:/Full%20stack%20training/selenium_scripts/HTML_files/ContextClick.html");
		
		WebElement click=driver.findElement(By.id("div-context"));
		Actions builder=new Actions(driver);
		
		builder.contextClick(click);
		builder.perform();
		
		WebElement option=driver.findElement(By.id("ui-id-4"));
		builder.click(option);
		builder.perform();
		
		Alert simpleAlert=driver.switchTo().alert();

		Thread.sleep(3000);

		simpleAlert.accept();
			



	}

}
