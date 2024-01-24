package mypack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@DataProvider(name="testdata")//this methos provide data/paramters to test
	  public Object[][]dataproviderMethod(){
		  return new Object[][] {{1,2},{3,4}};
	  }
}
