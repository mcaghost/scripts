package mypack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
  @DataProvider(name="testdata")//this methos provide data/paramters to test
  public Object[][]dataproviderMethod(){
	  return new Object[][] {{1,2},{3,4}};
  }
  @Test(dataProvider="testdata")
  public void addition(int a, int b) {
	  int sum=a+b;
	  System.out.println("The sum of two numbers is " +sum);
  }
  
}
