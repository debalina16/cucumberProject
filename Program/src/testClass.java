
public class testClass {

	static int a;
	static boolean b;
	static float f;
	static double d;
	static long l;
	static char c;
	static byte b1;
	public static void main (String args[]){
		int a=10;
		System.out.println(a);
		System.out.println(testClass.a);
		testClass s=new testClass();
		System.out.println(a);
		a=100;
		System.out.println(testClass.a);
		testClass.a=8000;
		System.out.println(s.a);
		System.out.println(testClass.a);
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(c);
		System.out.println(b1);	
}
}
