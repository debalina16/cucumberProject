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
public class errorVerification {
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
	public void testThird() {
		/* Click on mobile submenu */
		d.findElement(By.xpath("//a[text()='Mobile']")).click();
		/* Click on Add to Cart option */
		d.findElement(By.xpath("//h2/a[text()='Sony Xperia']/../../div/button")).click();
		/* Add quantity to 1000 */
		d.findElement(By.xpath("//input[@class='input-text qty']")).clear();
		d.findElement(By.xpath("//input[@class='input-text qty']")).sendKeys("1000");
		/* click on update Button */
		d.findElement(By.xpath("//span[text()='Update']")).click();
		/* verify the error message */
		String actErrorMsg = d.findElement(By.xpath("//li[@class='error-msg']/ul/li/span")).getText();
		/* verify the error Message */
		boolean statusForProduct = actErrorMsg.contains("cannot be ordered in requested quantity");
		Assert.assertTrue(statusForProduct);
		/* click on Empty Cart Button */
		d.findElement(By.xpath("//span[text()='Empty Cart']")).click();
		/* verify cart is empty */
		String shoppingCartStatus = d.findElement(By.xpath("//div[@class='main-container col1-layout']/div/div/div/h1"))
				.getText();
		boolean statusForCart = shoppingCartStatus.contains("CART IS EMPTY");
		Assert.assertTrue(statusForCart);

	}

	@AfterTest
	public void close() {
		/* close the Browser */
		d.close();
	}
}
