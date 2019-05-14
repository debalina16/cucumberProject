/**
 * 
 */
package Annotation;

import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class CustomerDependsOn {

	@Test
	public void Test1() {
		System.out.println("Execute Test1");
		int arr[]= {};
		System.out.println(arr[2]);
	}
	@Test(dependsOnMethods="Test1")
	public void Test2() {
		System.out.println("Execute Test2");
	}
	@Test(dependsOnMethods="Test2")
	public void Test3() {
		System.out.println("Execute Test3");
	
	}

}
