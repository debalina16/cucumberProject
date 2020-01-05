/**
 * 
 */
package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Debalina
 *
 */
public class ObjectUltilities {

	public WebDriver ldriver;
	public ObjectUltilities(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}

public void pageLoad(int time) {
	WebDriver driver;
	ldriver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}

public void pageLoadForElement(int time,WebElement element) {
	WebDriverWait wait=new WebDriverWait(ldriver,time);
	wait.until(ExpectedConditions.visibilityOf(element));
}
}