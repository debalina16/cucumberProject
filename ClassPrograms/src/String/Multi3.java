package String;

public class Multi3 {
public static void main(String[] args) {
	Multi3 m1=new Multi3();
	Multi3 m2=new Multi3();
	Multi3 m3=m1;
	System.out.println(m1.equals(m2));
	System.out.println(m1.equals(m3));
	System.out.println(m1.hashCode());
	System.out.println(m2.hashCode());
	System.out.println(m3.hashCode());
	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m1.toString());
}
}
