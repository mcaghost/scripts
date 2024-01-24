package testpkg;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateBy_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		//absolute oath
		WebElement testing=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[1]/b"));
		System.out.println(testing.getText());
		
		WebElement test=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[2]/b"));
		System.out.println(test.getText());
		
		
		//relative path
		WebElement test2=driver.findElement(By.xpath("//div[@class='featured-box']//h4[1]//b[1]"));
		System.out.println(test2.getText());
		
		//locate by contains xapath
		WebElement test3=driver.findElement(By.xpath("//div[@class='featured-box']//h4[1]//b[1]"));
		System.out.println(test2.getText());
		
		
		

		

	}
	
}
