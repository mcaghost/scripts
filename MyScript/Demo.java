package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement Searchbox=driver.findElement(By.id("APjFqb"));
		Searchbox.sendKeys("Photos");
		WebElement btn=driver.findElement(By.name("btnK"));
		btn.submit();
		System.out.println(btn.getText());
		
		
		

	}

}
