/**
 * 
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Debalina
 *
 */
public class arrList1 {
	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add(10);
		a1.add(null);
		a1.add("Abc");
		a1.add(1, "xyz");
		a1.add(10.25f);
		a1.add(10.25);
		System.out.println(a1);
		/* traversing */
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		/* Alternative way for traversing */
		for (Object obj : a1) {
			System.out.println(obj);
		}

	}
}
