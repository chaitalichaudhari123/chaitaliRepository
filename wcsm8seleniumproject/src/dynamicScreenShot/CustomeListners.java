package dynamicScreenShot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class CustomeListners extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test case is start",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test case Executed Succesfully",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log(failedMethod+":This the failed method of test case",true);
        failedMethod(failedMethod);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test case is failed",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
 
 
}
