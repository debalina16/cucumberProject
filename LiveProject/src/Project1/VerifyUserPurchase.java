/**
 * 
 */
package Project1;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

/**
 * @author Debalina
 *
 */
public class VerifyUserPurchase {
	private WebDriver d;
	FileLib flib = new FileLib();

	@BeforeTest
	public void setUp() {
		/* login to website by using firefox browser */
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		/* Click on mobile submenu */
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testSixth() throws Throwable {
		String eMail = flib.getExcelData("Sheet5", 10, 5);
		String pWd = flib.getExcelData("Sheet5", 10, 6);
		/* Click on My Account Link */
		d.findElement(By.xpath("//div[@class='account-cart-wrapper']/a/span[text()='Account']")).click();
		WebElement myaccOpt = d.findElement(By.xpath("//div[@id='header-account']/div"));
		WebElement target = d.findElement(By.xpath("//div[@id='header-account']/div/ul/li[@class='first']"));
		Actions act = new Actions(d);
		act.moveToElement(myaccOpt).click(target).perform();

		/* login by exsisting credentials */
		d.findElement(By.xpath("//input[@id='email']")).sendKeys(eMail);
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys(pWd);
		d.findElement(By.xpath("//span[text()='Login']")).click();

		/* click on My Wishlist option from the list */
		d.findElement(By.xpath("//div[@class='account-cart-wrapper']/a/span[text()='Account']")).click();
		WebElement myaccOptforwishlist = d.findElement(By.xpath("//div[@id='header-account']/div"));
		WebElement targetforwishlist = d
				.findElement(By.xpath("//div[@class='links']/ul/li/a[contains(@href,'index.php/wishlist')]"));
		Actions act1 = new Actions(d);
		act1.moveToElement(myaccOptforwishlist).click(targetforwishlist).perform();

		/* click on add to cart link */
		try {
			if (d.findElement(By.xpath("//p[text()='You have no items in your wishlist.']")).isDisplayed()) {
				d.findElement(By.xpath("//a[text()='TV']")).click();
				d.findElement(By.xpath("//a[text()='LG LCD']/../../div/ul/li/a[text()='Add to Wishlist']")).click();
				d.findElement(By.xpath("//div[@class='cart-cell']/button/span/span")).click();
			}
		} catch (NoSuchElementException e) {

			d.findElement(By.xpath("//div[@class='cart-cell']/button/span/span")).click();

		}

		/* add required country and state info and proceed to checkout */
		WebElement countrySelect = d.findElement(By.xpath("//select[@id='country']"));
		Select sp = new Select(countrySelect);
		sp.selectByVisibleText("United States");

		WebElement stateSelect = d.findElement(By.xpath("//select[@id='region_id']"));
		Select sp1 = new Select(stateSelect);
		sp1.selectByVisibleText("New York");
		d.findElement(By.xpath("//input[@id='postcode']")).sendKeys("542896");

		/* click on ESTIMATE */
		d.findElement(By.xpath("//span[text()='Estimate']")).click();
		/* Verify Shipping cost generated */
		String sFlatRate = "Flat Rate";
		String flatRate = d.findElement(By.xpath(".//*[@id='co-shipping-method-form']/dl/dt")).getText();
		try {
			assertEquals(sFlatRate, flatRate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String ShippingcostG = d.findElement(By.xpath("//label[@for='s_method_flatrate_flatrate']/span")).getText();
		System.out.println("Shipping cost generted:" + ShippingcostG);

		/* select shipping cost,updated total */
		d.findElement(By.xpath("//input[@id='s_method_flatrate_flatrate']")).click();
		d.findElement(By.xpath("//span[text()='Update Total']")).click();

		/* verify shipping cost added to total */
		String Subtotal = d.findElement(By.xpath("//tr/td[contains(text(),'Subtotal')]/../td[2]")).getText();
		String shippingcharges = d
				.findElement(By.xpath("//tr/td[contains(text(),'Shipping & Handling (Flat Rate - Fixed)')]/../td[2]"))
				.getText();
		String GrandTotalPrice = d.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tfoot/tr/td[2]"))
				.getText();
		/* verify Shipping charges */
		try {
			assertEquals(ShippingcostG, shippingcharges);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(Subtotal + "+" + shippingcharges + "=" + "GrandTotal Price=" + GrandTotalPrice);

		/* Click on Proceed to checkout */
		d.findElement(By.xpath("//ul[@class='checkout-types top']")).click();

		/* Enter Shipping and Billing Address Information */

		/* Billing Address */
		try {
			try {
				Select bAddr = new Select(d.findElement(By.name("billing_address_id")));
				int bAddrSize = bAddr.getOptions().size();
				bAddr.selectByIndex(bAddrSize - 1);
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("No dropdown element present");
			}

			d.findElement(By.id("billing:firstname")).clear();
			d.findElement(By.id("billing:firstname")).clear();
			d.findElement(By.id("billing:firstname")).sendKeys("Debalina");
			d.findElement(By.id("billing:lastname")).clear();
			d.findElement(By.id("billing:lastname")).sendKeys("Das");
			d.findElement(By.id("billing:company")).clear();
			d.findElement(By.id("billing:street1")).clear();
			d.findElement(By.id("billing:street1")).sendKeys("148 Crown Street");
			new Select(d.findElement(By.xpath("//select[@id='billing:country_id']"))).selectByIndex(14);
			Thread.sleep(2000);
			d.findElement(By.id("billing:city")).clear();
			d.findElement(By.id("billing:city")).sendKeys("Sydney");
			d.findElement(By.id("billing:region")).clear();
			d.findElement(By.id("billing:region")).sendKeys("New South Wales");
			d.findElement(By.id("billing:postcode")).clear();
			d.findElement(By.id("billing:postcode")).sendKeys("2000");
			d.findElement(By.id("billing:telephone")).clear();
			d.findElement(By.id("billing:telephone")).sendKeys("8850 6789");

			/* check radio button to "Ship to different address" */
			d.findElement(By.id("billing:use_for_shipping_no")).click();

			/*
			 * click the CONTINUE button, after the click above, it is still on same web
			 * page: live.guru99.com/index.php/checkout/onepage/
			 */
			d.findElement(By.xpath(".//*[@id='billing-buttons-container']/button")).click();

			/* Shipping Address */
		} catch (NoSuchElementException e) {

			d.findElement(By.xpath("//input[@id='billing:street1']")).clear();
			d.findElement(By.xpath("//input[@id='billing:street1']")).sendKeys("ABC");
			d.findElement(By.xpath("//input[@id='billing:city']")).sendKeys("New York");
			WebElement stateSelectBilling = d.findElement(By.xpath("//select[@id='billing:region_id']"));
			Select sp2 = new Select(stateSelectBilling);
			sp2.selectByVisibleText("New York");
			d.findElement(By.xpath("//input[@id='billing:postcode']")).clear();
			d.findElement(By.xpath("//input[@id='billing:postcode']")).sendKeys("542896");
			d.findElement(By.xpath("//input[@id='billing:telephone']")).clear();
			d.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys("12345678");

			WebElement countrySelectBilling = d.findElement(By.xpath("//select[@id='billing:country_id']"));
			Select sp3 = new Select(countrySelectBilling);
			sp3.selectByVisibleText("United States");
			Thread.sleep(2000);
			/* proceed to continue button */
			d.findElement(By.xpath("//div[@id='billing-buttons-container']/button")).click();
		}

		// switching to new window
		for (String handle : d.getWindowHandles()) {
			d.switchTo().window(handle);
		}
		Thread.sleep(2000);
		/* Billing Address */
		try {
			Select sAddr = new Select(d.findElement(By.name("shipping_address_id")));
			int sAddrSize = sAddr.getOptions().size();
			sAddr.selectByIndex(sAddrSize - 1);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("No dropdown element present");
		}

		Thread.sleep(3000);

		d.findElement(By.id("shipping:firstname")).clear();
		d.findElement(By.id("shipping:firstname")).clear();
		d.findElement(By.id("shipping:firstname")).sendKeys("Debarati");
		d.findElement(By.id("shipping:lastname")).clear();
		d.findElement(By.id("shipping:lastname")).sendKeys("Das");
		d.findElement(By.id("shipping:company")).clear();

		d.findElement(By.id("shipping:street1")).clear();
		d.findElement(By.id("shipping:street1")).sendKeys("50 Berry Street");
		d.findElement(By.id("shipping:street2")).clear();
		// shipping country must be selected first from dropdown
		new Select(d.findElement(By.xpath("//select[@id='shipping:country_id']"))).selectByIndex(14);
		// once Australia is selected, then the region and city becomes simply a text
		// input, instead of dropdown
		d.findElement(By.id("shipping:region")).clear();
		d.findElement(By.id("shipping:region")).sendKeys("New Sounth Wales");
		d.findElement(By.id("shipping:city")).clear();
		d.findElement(By.id("shipping:city")).sendKeys("Sydney");
		d.findElement(By.id("shipping:postcode")).clear();
		d.findElement(By.id("shipping:postcode")).sendKeys("2000");
		d.findElement(By.id("shipping:telephone")).clear();
		d.findElement(By.id("shipping:telephone")).sendKeys("8034 1234");

		Thread.sleep(3000);

		d.findElement(By.xpath(".//*[@id='shipping-buttons-container']/button")).click();

		/* consider shipping price then click on continue button */
		String ShippingPrice = d.findElement(By.xpath("//label/span[@class='price']")).getText();
		System.out.println("Flat Rate:" + ShippingPrice);
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/button/span/span[text()='Continue']"))
				.click();

		/* click on check/money order ration button and continue */
		d.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
		d.findElement(By.xpath("//div[@id='payment-buttons-container']/button[@class='button']")).click();
		/* Total product cost */
		String shippingTot = d
				.findElement(By.xpath("//tr/td[contains(text(),'Shipping & Handling (Flat Rate - Fixed)')]/../td[2]"))
				.getText();
		String grandTot = d.findElement(By.xpath("//tr[@class='last']/td[@class='a-right last']")).getText();
		System.out.println("Shipping Price:" + shippingTot + " and Grand Total:" + grandTot);

		/* click on continue */
		d.findElement(By.xpath("//span[text()='Place Order']")).click();

		/* order and order number are generated */
		String orderConfirmationMsg1 = d.findElement(By.xpath("//div[@class='col-main']/h2")).getText();
		String orderNumber = d.findElement(By.xpath("//div/p/a[contains(@href,'/index.php/sales/order/view')]"))
				.getText();
		System.out.println(orderConfirmationMsg1);
		System.out.println("*** Your order number for your record = " + "::" + orderNumber);

	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		d.quit();
	}
}
