/**
 * 
 */
package Project2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCase5 {

	private WebDriver driver;
	private String baseUrl;

	@DataProvider(name = "GuruTest")
	public Object[][] testData() {

		Object[][] data = new Object[4][2];

		/* 1st row */
		data[0][0] = Util.USER_NAME;
		data[0][1] = Util.PASSWD;
		/* 2nd row */
		data[1][0] = Util.Invalid_USER_NAME;
		data[1][1] = Util.PASSWD;
		/* 3rd row */
		data[2][0] = Util.USER_NAME;
		data[2][1] = Util.Invalid_PASSWD;
		/* 4th row */
		data[3][0] = Util.Invalid_USER_NAME;
		data[3][1] = Util.Invalid_PASSWD;
		return data;
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		/* Setting Base URL of website Guru99 */
		baseUrl = Util.BASE_URL;
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
		driver.get(baseUrl + "/V4/");
	}

	@Test(dataProvider = "GuruTest")
	public void testCase05(String username, String password) throws Exception {
		/* Enter valid UserId */
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(username);
		/* Enter valid Password */
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		/* Click Login Button */
		driver.findElement(By.name("btnLogin")).click();

		try {
			Alert alt = driver.switchTo().alert();
			/* get content of the Alter Message */
			String actualBoxMsg = alt.getText();
			alt.accept();
			/* Compare Error Text with Expected Error Value */
			try {
				assertEquals(actualBoxMsg, Util.EXPECT_ERROR);
				System.out.println("Error Msg is matched====>Pass");
			} catch (Exception e) {
				System.out.println("Error Msg is not matched====>Fail");
			}

		} catch (NoAlertPresentException Ex) {
			/* Get text displays on login page */
			String pageText = driver.findElement(By.tagName("tbody")).getText();
			String expTitle = driver.getTitle();
			/* login verified */
			try {
				Assert.assertEquals(expTitle, Util.EXPECT_TITLE);
				System.out.println("Login is Successful====>Pass");
			} catch (Exception e) {
				System.out.println("Login Failed====>Fail");
			}
			/* Extract the dynamic text mngrXXXX on page */
			String[] parts = pageText.split(Util.PATTERN);
			String dynamicText = parts[1];

			try {
				/*
				 * Check that the dynamic text is of pattern mngrXXXX First 4 characters must be
				 * "mngr"
				 */
				assertTrue(dynamicText.substring(1, 5).equals(Util.FIRST_PATTERN));
				/* remain stores the "XXXX" in pattern mngrXXXX */
				String remain = dynamicText.substring(dynamicText.length() - 4);
				/* Check remain string must be numbers */
				assertTrue(remain.matches(Util.SECOND_PATTERN));
				System.out.println("ManagerID: " + dynamicText + " is verified====>Pass");
			} catch (Exception e) {
				System.out.println("ManagerID: " + dynamicText + " is not verified====>Fail");
			}
			/*Capture a screenshot*/
			EventFiringWebDriver ed=new EventFiringWebDriver(driver);
			File srcFile=ed.getScreenshotAs(OutputType.FILE);
			File destFile=new File("E:\\Java\\LiveProject\\Screenshot\\test.png");
			FileUtils.copyFile(srcFile, destFile);
			

		}
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}