/**
 * 
 */
package Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Debalina
 *
 */
public class ArrList3 {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList();
		lst.add("s");
		lst.add("a");
		lst.add("m");
		lst.add("d");
		
		ArrayList<String> olst=lst;
		System.out.println("Before Sort==>"+olst);
		Collections.sort(lst);
		System.out.println("After Soft==>"+lst);
		
		for(int i=0;i<lst.size();i++) {
			if(lst.get(i).equals(olst.get(i))) {
				System.out.println("not equal");
				break;
			}
		}
	}
}
