/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class varAssign1 {
	static int a;
	static int b;
	int c;
	int d;

	void assign(int a1, int b1, int c1, int d1) {
		a = a1;
		b = b1;
		c = c1;
		d = d1;
	}

	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

	public static void main(String[] args) {
		varAssign1 vb = new varAssign1();
		vb.assign(10, 20, 30, 40);
		vb.print();

	}
}
