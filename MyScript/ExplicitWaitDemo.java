//package myscript;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class ExplicitWaitDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();
//		
//		//navigate to google.com
//		driver.get("https://demoqa.com/alerts");
//		
//		
//		WebElement alert1 = driver.findElement(By.id("timerAlertButton"));
//		alert1.click();
//		
//		Alert simpleAlert = driver.switchTo().alert();
//		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//
//		Alert myalert = wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert();
//		
//		myalert.accept();
//		System.out.println("Alert accepted");
//	}
//
//}
