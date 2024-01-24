package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;


public class CssSelectorBy_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		//locate firstName textbox
		WebElement firstName=driver.findElement(By.cssSelector("input[id='firstName']"));
		//locate lastName textbox
		WebElement lastName=driver.findElement(By.cssSelector("input#lastName"));//using id " # "
		
		WebElement email=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));//usign placeholder
		
		WebElement phone=driver.findElement(By.cssSelector("input[placeholder='Mobile Number'][id='userNumber']"));//usign placeholder

		
		WebElement address=driver.findElement(By.cssSelector("textarea.form-control"));//using class "."
		
		WebElement currentadd=driver.findElement(By.cssSelector("div>textarea[placeholder='Current Address']"));//parent-child locator
		
		WebElement option1=driver.findElement(By.id("gender-radio-1"));
		WebElement option2=driver.findElement(By.id("gender-radio-2"));
		WebElement option3=driver.findElement(By.id("gender-radio-3"));
		
		   WebElement checkbox1 = driver.findElement(By.id("hobbies-checkbox-1"));
		    WebElement checkbox2 = driver.findElement(By.id("hobbies-checkbox-2"));
		    WebElement checkbox3 = driver.findElement(By.id("hobbies-checkbox-3"));
		   
		
		

		firstName.sendKeys("Abhishek");
		lastName.sendKeys("Joshi");
		email.sendKeys("joshiabhishek2255@gmail.com");
		address.sendKeys("Janshi , Tal.Rajapur Dist.Ratnagiri");
		phone.sendKeys("9421442798");
		currentadd.sendKeys("Ratnagiri");
		
		 option1.click();
			checkbox1.click();
			checkbox3.click();
		
		
		

	}

}
