/**
 * 
 */
package Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Debalina
 *
 */
public class hashSet1 {
	public static void main(String[] args) {
		Set a1 = new HashSet();
		a1.add(10);
		a1.add(null);
		a1.add(90);
		a1.add("abc");
		a1.add(null);
		a1.add(1);
		a1.add(107);
		a1.add("xyz");
		System.out.println(a1.size());
		System.out.println(a1);
		/* Alternative way for traversing */
		for (Object obj : a1) {
			System.out.println(obj);
		}

	}
}
