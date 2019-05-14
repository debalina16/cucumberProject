/**
 * 
 */
package com.actitime.genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

/**
 * @author Debalina
 *
 */
public class BaseClass {
	public  WebDriver driver;
	FileLib flib = new FileLib();
	WebdriverCommonLib webdri = new WebdriverCommonLib();

	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("Connect to database");
	}

  /*@Parameters("browser")
	@BeforeTest
	public void configBT(String browserValue) throws Throwable {
		if (browserValue.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserValue.equals("chrome")) {
			driver = new ChromeDriver();
		}
		String url = flib.getPropertyKeyValue("url");
		webdri.waitForPageToLoad(driver);
		driver.get(url);
	}*/

	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("===========Launch a Browser===========");
		 /*Launch a Browser*/
		String BROWSER = flib.getPropertyKeyValue("browser");
		String url = flib.getPropertyKeyValue("url");
		if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		webdri.waitForPageToLoad(driver);
		driver.get(url);
	}
	 
	@BeforeMethod
	public void configBM() throws Throwable {
		/* read data from external resource */
		String userName = flib.getPropertyKeyValue("username");
		String password = flib.getPropertyKeyValue("password");

		/* Step 1:login to app */

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

	@AfterMethod
	public void configAM() {
		/* Logout Application */
		driver.findElement(By.linkText("Logout")).click();

	}

	@AfterClass
	public void configAC() {
		/* close a browser */
		driver.close();
		System.out.println("===========Close a Browser===========");
	}

}
