package mypack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterannotations {
  @BeforeSuite
  public void beforesuite() {
	  System.out.println("Before Suite Method");//it will execute before test in suite
  }
  @AfterSuite
  public void afteresuite() {
	  System.out.println("After Suite Method");//it will execute after all test in suite are executed
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("Before Test Method");//it will execute before test
  }
  @AfterTest
  public void aftertest() {
	  System.out.println("After Test Method");//it will execute after test
  }
  @BeforeClass
  public void beforeclass() {
	  System.out.println("Before class Method");//it will execute before method class excute
  }
  @AfterClass
  public void afterclass() {
	  System.out.println("After class Method");//it will execute before method in class excuted
  }
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("Before Method");//it will execute before each method is executed
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("After Method");//it will execute after each method is executed
  }
  @BeforeGroups(groups= {"testone"})
  public void beforeGroupOne() {
	  System.out.println("Before Group Test one Method");//it will execute before group method is executed
  }
  @AfterGroups(groups= {"testone"})
  public void afterGroupOne() {
	  System.out.println("After Group Test one Method");//it will execute after  group method is executed
  }
  @BeforeGroups(groups= {"testtwo"})
  public void beforeGroupTwo() {
	  System.out.println("Before Group Test two Method");//it will execute before group method is executed
  }
  @AfterGroups(groups= {"testtwo"})
  public void afterGroupTwo() {
	  System.out.println("After Group Test two Method");//it will execute after  group method is executed
  }
  
  @Test(groups= {"testOne"})
  public void testOneMethod() {
	  System.out.println("First test method");
  }
  @Test(groups= {"testOne"})
  public void testTwoMethod() {
	  System.out.println("Second test method");
  }
  @Test(groups= {"testtwo"})
  public void testThreeMethod() {
	  System.out.println("Third test method");
  }
  @Test(groups= {"testtwo"})
  public void testFourMethod() {
	  System.out.println("Fourth test method");
  }
}
