package testpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlertsORAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///D:/Full%20stack%20training/selenium_scripts/Htmlfiles/train_reservation.html");
		
		//handling Simple Alert
		WebElement trains=driver.findElement(By.linkText("Trains"));
		trains.click();
		
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(3000);
		simpleAlert.accept();
		
		Thread.sleep(3000);
		
		WebElement confirm=driver.findElement(By.cssSelector("input[value='Confirm Details']"));
		confirm.click();
		
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		promptAlert.sendKeys("20");
		Thread.sleep(3000);

		promptAlert.accept();
		
		WebElement confirm_ticket=driver.findElement(By.cssSelector("input[value='Book Tickets']"));
		confirm_ticket.click();
		
		Alert confirm_ticketalert=driver.switchTo().alert();
		System.out.println(confirm_ticketalert.getText());

		Thread.sleep(3000);

		confirm_ticketalert.dismiss();


		
	}

}
