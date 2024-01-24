package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//navigate to google.com
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //implicit wait  time of 10sec
		
		System.out.println("Title:"+driver.getTitle());
	}

}
