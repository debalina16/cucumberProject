/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class static_NonstaticMethods {
 static static_NonstaticMethods m;
 static int a;
 void m1() {
	 System.out.println("Non-static method 1");
	 m2();
	 m3();
 }
 void m2() {
	 System.out.println("Non-static method 2");
 }
 static void m3() {
	 System.out.println("Static method 1");
	 m.m2();
 }
 static void m4() {
	 System.out.println("Static method 2");
	
 }	
	public static void main(String[] args) {
		m=new static_NonstaticMethods();
		m.m1();
		m4();
	}

}
