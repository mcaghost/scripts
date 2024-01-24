package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;


public class Locate_RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		WebElement option2=driver.findElement(By.id("vfb-7-2"));
		WebElement option3=driver.findElement(By.id("vfb-7-3"));
		
		//select 2nd radio button
		option2.click();
		
		option3.click();
		
		//handling checkboxes
		WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
		
		checkbox1.click();
		checkbox2.click();
		checkbox2.click();//uncheck checkbox
		checkbox3.click();
		
		
	}
	

}
