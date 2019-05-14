/**
 * 
 */
package Annotation;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class ReportTest {
	@Test
	public void createReportTest() {
		System.out.println("Step 1");
		System.out.println("Step 2");
		Assert.assertEquals("A", "B");
		System.out.println("Step 3");
		Assert.assertEquals("X", "Y");
		System.out.println("Step 4");

	}

	@Test
	public void modifyReportTest() {
		System.out.println("===========================");
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
        System.out.println("Step 4");

	}

}
