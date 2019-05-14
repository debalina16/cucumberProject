/**
 * 
 */
package Annotation;

import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class CutomerEnablityTest {
	@Test(priority=1)
	public void createCustomerTest() {
		System.out.println("createCustomerTest");
	}

	@Test(priority=2)
	public void modifyCustomerTest() {
		System.out.println("modifyCustomerTest");
	}

	@Test(enabled=false,priority=3)
	public void deleteCustomerTest() {
		System.out.println("deleteCustomerTest");
	}
}
