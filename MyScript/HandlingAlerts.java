package myscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Htmlfiles/train_reservation.html");
		
		WebElement train_link = driver.findElement(By.linkText("Trains"));
		train_link.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(3000);
		simpleAlert.accept();
		Thread.sleep(5000);
		WebElement trains = driver.findElement(By.cssSelector("input[value='Confirm Details']"));
		trains.click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("3");
		Thread.sleep(3000);
		promptAlert.accept();
		
		Thread.sleep(5000);
		WebElement trains2 = driver.findElement(By.cssSelector("input[value='Book Tickets']"));
		trains2.submit();
		
		Alert comfirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		comfirmAlert.dismiss();
		
		}
	}
