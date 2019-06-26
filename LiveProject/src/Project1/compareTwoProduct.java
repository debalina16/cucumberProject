/**
 * 
 */
package Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class compareTwoProduct {
	private WebDriver d;

	@BeforeTest
	public void setUp() {
		/* login to website by using firefox browser */
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		/* Click on mobile submenu */
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testFourth(){
		/* Click on mobile submenu */
		d.findElement(By.xpath("//a[text()='Mobile']")).click();

		/* click on Add to campare for sony */
		String sonyComparePick = d.findElement(By.xpath("//div/h2/a[text()='Sony Xperia']")).getText();
		d.findElement(By.xpath("//div/h2/a[text()='Sony Xperia']/../../div[@class='actions']/ul/li[2]")).click();

		/* click on Add to campare for iphone */
		String IphoneComparePick = d.findElement(By.xpath("//div/h2/a[text()='IPhone']")).getText();
		d.findElement(By.xpath("//div/h2/a[text()='IPhone']/../../div[@class='actions']/ul/li[2]")).click();

		/* click on compare button */
		d.findElement(By.xpath("//span[text()='Compare']")).click();

		/* switching to new window */
		for (String handle : d.getWindowHandles()) {
			d.switchTo().window(handle);
		}
		/* Verify Comparition Title is exist or not in comparision windows */
		String compareTitle = d.findElement(By.xpath("//h1[contains(text(),'Compare Products')]")).getText();
		Boolean statusForTitle = compareTitle.contains("COMPARE PRODUCTS");
		Assert.assertTrue(statusForTitle);

		/* Verify sony xperia is exist or not in comparision windows */
		String product1forComparition = d.findElement(By.xpath("//h2/a[text()='Sony Xperia']")).getText();
		Assert.assertEquals(sonyComparePick, product1forComparition);

		/* Verify Iphone is exist or not in comparision windows */
		String product2forComparition = d.findElement(By.xpath("//h2/a[text()='IPhone']")).getText();
		Assert.assertEquals(IphoneComparePick, product2forComparition);

		/* Close the Popup Windows */
		d.findElement(By.xpath("//button[@title='Close Window']")).click();

		/* switching to new window */
		for (String handle : d.getWindowHandles()) {
			d.switchTo().window(handle);
		}
	}

	@AfterTest
	public void close() {
		/* close the Browser */
		d.quit();
	}

}
