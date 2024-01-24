package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ActionOnelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		WebElement userid=driver.findElement(By.name("uid"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement btn=driver.findElement(By.name("btnLogin"));
		userid.sendKeys("abhis");
		password.sendKeys("1234");
		//btn.submit();
		System.out.println(userid.getLocation());
		System.out.println(userid.getCssValue("background-color"));
		System.out.println(userid.getCssValue("FONT_FAMILY"));
		System.out.println(userid.getSize());
		System.out.println(userid.getTagName());
		System.out.println(userid.isDisplayed());
		System.out.println(userid.isEnabled());



		
		
	}

}
