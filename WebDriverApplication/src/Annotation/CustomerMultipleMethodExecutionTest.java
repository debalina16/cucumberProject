/**
 * 
 */
package Annotation;

import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class CustomerMultipleMethodExecutionTest {
	@Test(priority=1)
	public void createCustomerTest() {
		System.out.println("createCustomerTest");
	}

	@Test(invocationCount=6,priority=2)
	public void modifyCustomerTest() {
		System.out.println("modifyCustomerTest");
	}

	@Test(enabled=false,priority=3)
	public void deleteCustomerTest() {
		System.out.println("deleteCustomerTest");
	}
}
