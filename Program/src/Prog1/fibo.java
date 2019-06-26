/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class fibo {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 1;
		System.out.println(num);
		System.out.println(num1);
		for (int i = 0; i < 7; i++) {
			int sum = num + num1;
			System.out.println(sum);
			num = num1;
			num1 = sum;
		}

	}
}
