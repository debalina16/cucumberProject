/**
 * 
 */
package Project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */

public class home {
	private WebDriver d;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeTest
	public void setup() {
		/* login to website by using firefox browser */
		d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testOne() {
		/* login to website by using firefox browser */
		WebDriver d = new FirefoxDriver();
		d.get("http://live.guru99.com/index.php/");
		/* verify home title */
		String expTitle = "Home page";
		String actTitle = d.getTitle();
		try {
			Assert.assertEquals(expTitle,actTitle);
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		/* Click on mobile submenu */
		d.findElement(By.xpath("//a[text()='Mobile']")).click();
		/* Mobile page title verify */
		String expTitleM = "Mobile";
		String actTitleM = d.getTitle();
		try {
			Assert.assertEquals(actTitleM, expTitleM);
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		/* Sort by name */
		WebElement nameSort = d
				.findElement(By.xpath("//div[@class='category-products']/div/div/div[@class='sort-by']/select"));

		Select sel = new Select(nameSort);

		sel.selectByVisibleText("Name");
		/* sort all mobile by name */
		String samsung = d.findElement(By.xpath("//div[@class='product-info']/h2/a[text()='Samsung Galaxy']"))
				.getText();
		String sony = d.findElement(By.xpath("//div[@class='product-info']/h2/a[text()='Sony Xperia']")).getText();
		String iphone = d.findElement(By.xpath("//div[@class='product-info']/h2/a[text()='IPhone']")).getText();

		ArrayList<String> act = new ArrayList<String>();

		act.add(samsung);
		act.add(iphone);
		act.add(sony);
		System.out.println(act + "===>Before Sorting");
		Collections.sort(act);
		System.out.println(act + "===>After Sorting");	
	}

	@AfterTest
	public void close() {
		/* close the Browser */
		d.close();
	}

}
