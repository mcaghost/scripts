package mypack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
  @Test
  @Parameters({"reviewer1_marks","reviewer2_marks"})
  public void if_shortlisted(int marks1,int marks2) {
	  
	  float average=(marks1+marks2)/2;
	  System.out.println("The average achieved by the writer is "+average);
	  if(average>=4) {
		  System.out.println("The writer shortlisted");
	  }
	  else {
		  System.out.println("The writer not shortlisted");

	  }
  }
}
