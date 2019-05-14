/**
 * 
 */
package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class CustomerDataLowlevelReporterTest {
	@Test
	public void createCustomerTest() {
		Reporter.log("createCustomerTest");
	}

	@Test
	public void modifyCustomerTest() {
		System.out.println();
		Reporter.log("modifyCustomerTest",true);
	}

	@Test
	public void deleteCustomerTest() {
		Reporter.log("deleteCustomerTest",true);
	}
}
