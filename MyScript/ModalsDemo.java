package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModalsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//navigate to hotel_search.html
		driver.get("file:///D:/Htmlfiles/hotel_search.html");
		
		WebElement hotelbtn = driver.findElement(By.cssSelector("button[data-target='#myModal']"));
		hotelbtn.click();
		
		WebElement hoteltitle = driver.findElement(By.className("modal-title"));
		System.out.println(hoteltitle.getText());
		
		Thread.sleep(3000);
		
		WebElement okbtn = driver.findElement(By.xpath("//button[text()='Ok']"));
		okbtn.click();
		
		Thread.sleep(3000);
		
		
		WebElement bookbtn = driver.findElement(By.id("myBtn1"));
		bookbtn.click();
		
		
		WebElement hotelname = driver.findElement(By.id("htlname"));
		hotelname.sendKeys("Mathura");
		
		Thread.sleep(3000);
		
		WebElement cancelbtn = driver.findElement(By.xpath("//button[@type='submit']//following::button"));
		cancelbtn.click();
		
		Thread.sleep(3000);
		
	}

}
