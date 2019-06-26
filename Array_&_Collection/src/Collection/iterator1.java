/**
 * 
 */
package Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Debalina
 *
 */
public class iterator1 {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(50);
		s.add(45);
		System.out.println(s);
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
