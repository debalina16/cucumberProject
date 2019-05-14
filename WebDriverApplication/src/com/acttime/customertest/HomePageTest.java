/**
 * 
 */
package com.acttime.customertest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

/**
 * @author Debalina
 *
 */
public class HomePageTest extends BaseClass{
	
	@Test(priority=1)
	public void homepageVerifyTest() {
		/*Verify the homepage*/
	String expTitle="actitime-Task";
	/*capture the homepage title from gui */
	String actTitle=driver.getTitle();
	
	Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority=2)
	public void homepagelogoImageVerifyTest() {
		/*identify & verify logo image*/
		boolean status=driver.findElement(By.xpath("//img[contains(@src,'.jpg')]")).isEnabled();
		//System.out.println(status);
		Assert.assertTrue(status);
		
	}
}
