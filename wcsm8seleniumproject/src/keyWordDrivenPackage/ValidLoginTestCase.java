package keyWordDrivenPackage;

public class ValidLoginTestCase extends BaseTest
{
	  BaseTest bt =new BaseTest();
	
	
	 Flib flib=new Flib();
	 
	 bt.openBrowser();
	 
	 driver.findElement(By.name("username")).sendkeys(flib.readPropertyData())

}
