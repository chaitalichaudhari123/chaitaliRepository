package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5DependsOn
{
  @Test(description = "login Testcase")
  public void loginMethod() 
  {
	  Reporter.log("login performed",true);
  }
  
  @Test(description = "createUser Testcase",dependsOnMethods="loginMethod")
  public void createUser() 
  {
	  Reporter.log("user Created",true);
  }
  
  @Test(description = "logOut Testcase",dependsOnMethods="createUser")
  public void logOutMethod() 
  {
	  Reporter.log("logout performed",true);
  }
}
