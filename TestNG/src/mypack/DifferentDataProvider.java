package mypack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferentDataProvider {
	@Test(dataProvider="testdata",dataProviderClass=DataProviderClass.class)
	  public void addition(int a, int b) {
		  int sum=a+b;
		  System.out.println("The sum of two numbers is " +sum);
	  }
}
