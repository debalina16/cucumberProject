/**
 * 
 */
package Project1;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class verifyDiscountCoupon {
	private WebDriver d;

	@BeforeTest
	public void setUp() {
		/* login to website by using firefox browser */
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testNinth() {

		/* goto mobile and add iphone to cart */
		d.findElement(By.xpath("//a[text()='Mobile']")).click();
		d.findElement(By.xpath("//a[text()='IPhone']/../../div[@class='actions']/button/span")).click();

		/* Enter coupon code */
		d.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("GURU50");
		d.findElement(By.xpath("//div[@class='button-wrapper']/button")).click();

		/* Verify the discount generated */
		String couponCode = d.findElement(By.xpath("//span[text()='Coupon code \"GURU50\" was applied.']")).getText();
		String discountVerify = d
				.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span")).getText();
		System.out.println("Discount:" + discountVerify);
		String couponCode1 = d.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tbody/tr[2]/td[1]"))
				.getText();
		try {
			assertEquals(couponCode.substring(13, 19), couponCode1.substring(10, 16));
		} catch (Exception e) {
			System.out.println("Discount is not applied");
		}

	}

	@AfterTest
	public void close() {
		/* close the Browser */
		d.close();
	}
}
