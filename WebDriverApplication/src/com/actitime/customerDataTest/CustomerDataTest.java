/**
 * 
 */
package com.actitime.customerDataTest;

import org.testng.annotations.Test;
import com.actitime.genericlib.BaseClass;

/**
 * @author Debalina
 *
 */
public class CustomerDataTest extends BaseClass {

	@Test(groups= {"Smoke Test"})
	public void createCustomerTest() {
		System.out.println("createCustomerTest");
	}

	/*@Test(groups= {"Smoke Test","Regression Test"})
	public void modifyCustomerTest() {
		System.out.println("modifyCustomerTest");
	}

	@Test(groups= {"Regression Test"})
	public void deleteCustomerTest() {
		System.out.println("deleteCustomerTest");
	}*/

}
