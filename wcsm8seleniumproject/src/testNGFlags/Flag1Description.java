package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1Description 
{
	// to describe the method
	
  @Test(description = "This Method Preforms Login!!")
  public void method1()
  {
	  Reporter.log("Method 1 Login!!",true);
  }
}
