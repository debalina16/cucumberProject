/**
 * 
 */
package Project2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Project1.FileLib;

/**
 * @author Debalina
 *
 */
public class Testcase3 {
	WebDriver driver = null;
	FileLib fb = new FileLib();

	/* login to demo.guru99 and verified */
	@BeforeMethod
	void setup() {
		driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	void loginVerified() throws Throwable {
		String login = fb.getExcelData("Sheet6", 1, 2);
		String passWd = fb.getExcelData("Sheet6", 1, 3);
		/* login to app */
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(login);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		/* login verified */
		String expTitle = "Guru99 Bank Manager HomePage";
		String actTitle = driver.getTitle();
		try {
			Assert.assertEquals(expTitle, actTitle);
			System.out.println("Login is Successful====>Pass");
		} catch (Exception e) {
			System.out.println("Login Failed====>Fail");
		}
	}

	@Test(priority = 2)
	void loginInvalidLoginAndValidPassword() throws Throwable {
		String invalidlogin = fb.getExcelData("Sheet6", 2, 2);
		String passWd = fb.getExcelData("Sheet6", 2, 3);
		/* login to app */
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(invalidlogin);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		/* capture the alert message */
		String actResult = driver.switchTo().alert().getText();
		/* Error Msg */
		System.out.println(actResult);
		/* login verified */
		String expResult = "User or Password is not valid";
		
		try {
			Assert.assertEquals(expResult, actResult);
			System.out.println("Error Msg is matched====>Pass");
		} catch (Exception e) {
			System.out.println("Error Msg is not matched====>Fail");
		}
		/* To click on the 'OK' button of the alert */
		driver.switchTo().alert().accept();
	}

	@Test(priority = 3)
	void loginValidLoginAndInvalidPassword() throws Throwable {
		String validlogin = fb.getExcelData("Sheet6", 3, 2);
		String invalidpassWd = fb.getExcelData("Sheet6", 3, 3);
		/* login to app */
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(validlogin);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(invalidpassWd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		/* capture the alert message */
		String actResult = driver.switchTo().alert().getText();
		/* Error Msg */
		System.out.println(actResult);
		/* login verified */
		String expResult = "User or Password is not valid";
		
		try {
			Assert.assertEquals(expResult, actResult);
			System.out.println("Error Msg is matched====>Pass");
		} catch (Exception e) {
			System.out.println("Error Msg is not matched====>Fail");
		}
		/* To click on the 'OK' button of the alert */
		driver.switchTo().alert().accept();
	}

	@Test(priority = 4)
	void loginInvalidLoginAndInvalidPassword() throws Throwable {
		String invalidlogin = fb.getExcelData("Sheet6", 4, 2);
		String invalidpassWd = fb.getExcelData("Sheet6", 4, 3);
		/* login to app */
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(invalidlogin);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(invalidpassWd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		/* capture the alert message */
		String actResult = driver.switchTo().alert().getText();
		/* Error Msg */
		System.out.println(actResult);
		/* login verified */
		String expResult = "User or Password is not valid";
		
		try {
			Assert.assertEquals(expResult, actResult);
			System.out.println("Error Msg is matched====>Pass");
		} catch (Exception e) {
			System.out.println("Error Msg is not matched====>Fail");
		}
		/* To click on the 'OK' button of the alert */
		driver.switchTo().alert().accept();
	}

	@AfterMethod
	void teardown() {
		driver.quit();
	}
}
