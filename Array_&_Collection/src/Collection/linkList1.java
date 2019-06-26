/**
 * 
 */
package Collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Debalina
 *
 */
public class linkList1 {
	public static void main(String[] args) {
		List a1 = new LinkedList();
		a1.add(10);
		a1.add(null);
		a1.add(90);
		a1.add(1);
		a1.add(107);
		a1.add(109);
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
