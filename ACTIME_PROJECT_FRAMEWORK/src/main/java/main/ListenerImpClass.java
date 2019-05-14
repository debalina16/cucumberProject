package main;
/**
 * 
 */


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author Debalina
 *
 */
public class ListenerImpClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
        String failedtestName=result.getMethod().getMethodName();
        /*Capture the file type of screenshot using "EventFiringWebDriver" class */
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClassLib.driver);
		File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
		/*Create a new file inside the framework*/
		File dstFile=new File("./screenshot/"+failedtestName+".png");
		
		try {
			/*copy the screenshot in a destination location*/
			FileUtils.copyFile(srcFile, dstFile);
		}catch(IOException e) {
			
		}
	}

	public void onTestStart(ITestResult result) {	
	}
	public void onTestSuccess(ITestResult result) {
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onTestFailedButWithinSuccessPercentage(org.testng.ITestResult)
	 */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onStart(org.testng.ITestContext)
	 */
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onFinish(org.testng.ITestContext)
	 */
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
