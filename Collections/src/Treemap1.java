import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap1 {
public static void main(String[] args) {
	Map<String, String> hm=new TreeMap<String, String>();
	hm.put("Bahubali", "Prabhas");
	hm.put("Kattapaa", "Satyaraj");
	hm.put("Devsena", "Anushka");
	hm.put("Irabati", "Anushka");
	System.out.println(hm);
	System.out.println(hm.get("Kattapaa"));
	Set s=hm.keySet();
	System.out.println(s);
	Set<Map.Entry<String, String>> s1=hm.entrySet();
	for(Map.Entry m1:s1) {
		System.out.print(m1.getKey()+" ");
		System.out.println(m1.getValue()+" ");					
	}
}
}
