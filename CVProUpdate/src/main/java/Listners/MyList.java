package Listners;

import org.testng.ITestContext;



import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;


import TestBase.BaseClass;
import Utils.ScreenShot;


public class MyList extends BaseClass implements ITestListener{
	
	  public void onTestStart(ITestResult result) {
		    test=report.createTest(result.getName());
	  }
	  
	  public void onTestSuccess(ITestResult result) {
	    test.log(Status.PASS, "Testcase Pass");
	
	  }
	  
	  public void onTestFailure(ITestResult result) {
		    test.log(Status.FAIL, "Testcase Failed");
          
		try {
			String path = ScreenShot.getScreenshot(result.getName());
		    test.addScreenCaptureFromPath(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	  }
	  
	  
	  public void onTestSkipped(ITestResult result) {
		    test.log(Status.SKIP, "Testcase Skip");
	  }
	  
	  

	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
	  }
	  
	  

	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	 
	  public void onStart(ITestContext context) {
	    
	  }

	  
	  public void onFinish(ITestContext context) {
	    report.flush();
	  }
	


}