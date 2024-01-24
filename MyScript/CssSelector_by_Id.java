package myscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_by_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium_setup\\chromedriver.exe");
		
		//creating instance of web driver
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/automation-practice-form");
	/*by id*/
		//locate first name textbox 
		WebElement firstname = driver.findElement(By.cssSelector("input[id='firstName']"));
	
		firstname.sendKeys("Sumit");
		
		//locate last name
		WebElement lastname = driver.findElement(By.cssSelector("input#lastName"));
		lastname.sendKeys("Chandale");
	/*by class*/
		//locate current address text area 
		//WebElement curr_addr = driver.findElement(By.cssSelector("textarea[class='form-control']"));
		WebElement curr_addr = driver.findElement(By.cssSelector("textarea.form-control"));
		curr_addr.sendKeys("Ratnagiri");
	/*by placeholder attribute*/
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		email.sendKeys("sumit@gmail.com");
	/*by id and placeholder attribute*/
		WebElement mobno = driver.findElement(By.cssSelector("input[id='userNumber'][placeholder='Mobile Number']"));
		mobno.sendKeys("6253421520");
	/*by hirarchical - parent child*/
		WebElement addr = driver.findElement(By.cssSelector("div>textarea[placeholder='Current Address']"));
		addr.sendKeys(" Mumbai");
		
		
	}

}
