/**
 * 
 */
package Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Debalina
 *
 */
public class haskSet2 {
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
		Set s = new HashSet();
		s.addAll(a1);
		System.out.println(s);
		System.out.println(a1);
		System.out.println(s.size());
		a1.clear();
		System.out.println(a1);
		a1.addAll(s);
		System.out.println(s);
		System.out.println(a1);
	}
}
