/**
 * 
 */
package Collection;

import java.util.LinkedHashMap;

/**
 * @author Debalina
 *
 */
public class Occurance {
	public static void main(String[] args) {
		String str = "betterbetter";
		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);

	}
}
