package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//navigate to hotel_search.html
		driver.get("file:///D:/Htmlfiles/flight_reservation.html");
		
		driver.switchTo().frame(0); //switch focus from window to frame1
		
		//locate and print heading in iframe 1
		
		WebElement heading_frm1 = driver.findElement(By.id("heading1"));
		System.out.println("Heading inside iframe1 is '" +heading_frm1.getText()+"'");
		
		driver.switchTo().defaultContent();//it will switch to main window
		
		driver.switchTo().frame("IF2");//frm2
		WebElement heading_frm2 = driver.findElement(By.id("heading2"));
		System.out.println("Heading inside iframe2 is ." +heading_frm2.getText()+"'");

		driver.switchTo().frame(0);//child of frm2
		WebElement heading_frm2_1 = driver.findElement(By.id("heading3"));
		System.out.println("Heading inside child iframe of iframe2 is '" +heading_frm2_1.getText()+"'");
	
		driver.switchTo().defaultContent();//it will switch to main window
		
		System.out.println("Heading inside main_page is '" + driver.getTitle()+"'");

	}

}
