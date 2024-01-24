package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locate_by_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		
		WebElement emailBox=driver.findElement(By.id("email"));//created web elements instance

		WebElement passwordBox=driver.findElement(By.id("passwd"));//created web elements instance
		
		WebElement Button=driver.findElement(By.id("SubmitLogin"));//created web elements instance
		
		//type
		emailBox.sendKeys("abhishek@gmail.com");
		emailBox.clear();
		emailBox.sendKeys("abc@gmail.com");
		passwordBox.sendKeys("abcdefghlkjl");
		//click the button
		Button.click();
		
		//it close browser
		driver.quit();


	}

}
