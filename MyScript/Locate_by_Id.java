package myscript;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locate_by_Id {

	public static void main(String[] args) {
		//set path to your browser driver
		System.setProperty("webdriver.chrome.driver","H:\\selenium_setup\\chromedriver.exe");
		//create webdriver instance
		WebDriver driver = new ChromeDriver();
		//navigate to the webpage
		driver.get("http://demo.guru99.com/test/login.html");
		//find email address textbox
		WebElement emailBox = driver.findElement(By.id("email"));
		//find password textbox
		WebElement password = driver.findElement(By.id("passwd"));
		//find sign in button
		WebElement signin = driver.findElement(By.id("SubmitLogin"));
		
		//type email in email box
		emailBox.sendKeys("abcd@gmail.com");
		emailBox.clear();
		//type password in password box
		password.sendKeys("abcdefghlkjl");
		password.clear();
		//click sign in button
		signin.click();
		
		driver.quit();
	}

}
