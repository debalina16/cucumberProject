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
public class VerifyCost {
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
	public void testSecond() {
		/* Click on mobile submenu */
		d.findElement(By.xpath("//a[text()='Mobile']")).click();
		/* fetch sony Price SubMenu */
		String sonySubMenuPrice = d
				.findElement(By.xpath("//div/h2/a[text()='Sony Xperia']/../../div[@class='price-box']")).getText();
		// System.out.println(sonyPriceSubMenuPrice);
		/* Click on Sony Xperia mobile */
		d.findElement(By.xpath("//div/h2/a[text()='Sony Xperia']")).click();
		/* fetch sony Price Page */
		String sonyPagePrice = d.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		/* Verify Price */
		try {
			Assert.assertEquals(sonySubMenuPrice, sonyPagePrice);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void close() {
		/* close the Browser */
		d.close();
	}
}
