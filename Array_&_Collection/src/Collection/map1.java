/**
 * 
 */
package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Debalina
 *
 */
public class map1 {
public static void main(String[] args) {
	Map<String,String> bB=new HashMap<String,String>();
	bB.put("Bahubali","Prabhas");
	bB.put("Kattappa", "Satyaraj");
	bB.put("Devsena", "Anushka");
	bB.put("Devsena", "Tammanna");
	System.out.println(bB);
	System.out.println(bB.get("Devsena"));
	Set<String> s=bB.keySet();
	System.out.println(s);
	Set<Map.Entry<String, String>> s1=bB.entrySet();
	for(Map.Entry m1:s1) {
		System.out.print(m1.getKey()+" ");
		System.out.println(m1.getValue());
	}
}
}
