package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate_Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//handling radio button
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		WebElement option2 = driver.findElement(By.id("1vfb-7-2"));
		WebElement option3 = driver.findElement(By.id("vfb-7-3"));
		
		//select 2nd radio button
		option2.click();
		//select 3rd radio button
		option3.click();
		
		//handling checkboxes
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		WebElement check2 = driver.findElement(By.id("vfb-6-1"));
		WebElement check3 = driver.findElement(By.id("vfb-6-2"));
		
		//check 1st checkbox
		check1.click();
		//check 2nd checkbox
		check2.click();
		//uncheck 2nd checkbox
		check2.click();
	}

}
