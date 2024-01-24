package testpkg;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.nio.file.Files;
public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geko.driver","H:\\selenium_setup\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//navigate to google.com
		driver.get("https://www.google.com");
		
		//setting capability in webdriver
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File scrFile = scrshot.getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
		
		File DestFile = new File("D:/Htmlfiles/ScreenShots/test.png");
		 Files.copy(scrFile.toPath(), DestFile.toPath());
	}

}
