package testpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate_by_ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		List<WebElement> list=driver.findElements(By.className("inputtext"));
		
		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i).getAttribute("name"));
		}
		list.get(0).sendKeys("abc@gmail.com");
		list.get(1).sendKeys("abc");

		
	}
		
		

	}


