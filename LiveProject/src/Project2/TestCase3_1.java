/**
 * 
 */
package Project2;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Project1.FileLib;

/**
 * @author Debalina
 *
 */
public class TestCase3_1 {
	WebDriver driver = null;

	/* login to demo.guru99 and verified */
	@BeforeMethod
	void setup() {
		driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "data")
	void loginVerified(String loginID, String passwd) throws Throwable {
		/* login to app */
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(loginID);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
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
	}

	@DataProvider(name = "data")
	public Object[][] fetchdataforlogin() throws Throwable {
		FileLib flib = new FileLib();
		int rowCount = flib.getRowCount("Sheet6");
		Object[][] objArr = new Object[rowCount][2];
		for (int i = 1; i <rowCount; i++) {
			objArr[i][0] = flib.getExcelData("Sheet6", i, 0);
			objArr[i][1] = flib.getExcelData("Sheet6", i, 1);
		}
		return objArr;

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}
