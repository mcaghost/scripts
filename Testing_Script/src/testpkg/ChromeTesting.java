package testpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating instance of web driver
		driver.get("https://www.google.com");//navigate to webpage
		
		WebElement searchBox=driver.findElement(By.name("q"));//created web elements instance
		searchBox.sendKeys("hello");
		
		WebElement Button=driver.findElement(By.name("btnK"));//created web elements instance
		Button.submit();

	}

}
