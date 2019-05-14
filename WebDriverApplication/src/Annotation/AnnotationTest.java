/**
 * 
 */
package Annotation;

import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

/**
 * @author Debalina
 *
 */
public class AnnotationTest extends BaseClass {
	@Test
	public void customerCreationTest() {
		System.out.println("customerCreationTest");
	}

	@Test
	public void customerModificationTest() {
		System.out.println("customerModificationTest");
	}

}
