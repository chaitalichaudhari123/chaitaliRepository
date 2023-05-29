package dynamicScreenShot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TestCase extends BaseTest
{
  @Test
  public void login() 
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Assert.Fail();
	  driver.findElement(By.id("loginButton")).click();
  }
}
