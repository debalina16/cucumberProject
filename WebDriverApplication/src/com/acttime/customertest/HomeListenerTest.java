/**
 * 
 */
package com.acttime.customertest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import com.actitime.genericlib.BaseClass;

/**
 * @author Debalina
 *
 */
@Listeners(com.actitime.genericlib.ListenerImpClass.class)
public class HomeListenerTest extends BaseClass {
	@Test(priority = 1)
	public void homepageVerifyTest() {
		/* Verify the homepage */
		String expTitle = "actitime-Task";
		/* capture the homepage title from gui */
		String actTitle = driver.getTitle();
        AssertJUnit.assertEquals(actTitle, expTitle);
	}

	@Test(priority = 2)
	public void homepagelogoImageVerifyTest() {
		/* identify & verify logo image */
		boolean status = driver.findElement(By.xpath("//img[contains(@src,'.jpg')]")).isEnabled();
		// System.out.println(status);
		AssertJUnit.assertTrue(status);

	}
}
