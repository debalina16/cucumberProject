/**
 * 
 */
package Annotation;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Debalina
 *
 */
public class SoftAssertReportTest {
	@Test
	public void createReportTest() {
		System.out.println("Step 1");
		System.out.println("Step 2");
		SoftAssert s=new SoftAssert();
		s.assertEquals("A", "B");
		System.out.println("Step 3");
		s.assertEquals("X", "Y");
		System.out.println("Step 4");
		s.assertAll();

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
