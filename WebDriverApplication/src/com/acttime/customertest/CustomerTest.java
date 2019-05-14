/**
 * 
 */
package com.acttime.customertest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebdriverCommonLib;

/**
 * @author Debalina
 *
 */
public class CustomerTest {
/**
 * @param args
 * @throws Throwable
 */
public static void main(String[] args) throws Throwable {
	/*create an object generic libraries class*/
	FileLib fLib=new FileLib();
	WebdriverCommonLib wLib=new WebdriverCommonLib();
	/* read data from external resource */
	String url=fLib.getPropertyKeyValue("url");
	String userName=fLib.getPropertyKeyValue("username");
	String password=fLib.getPropertyKeyValue("password");
	String customerName=fLib.getExcelData("Sheet1", 1, 2);
	System.out.println(customerName);
	
	/* Step 1:login to app */
	WebDriver driver=new FirefoxDriver();
	wLib.waitForPageToLoad(driver);
	
	driver.get(url);
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys(userName);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
   }
}
