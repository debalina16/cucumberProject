/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class evenCheck {
	public static void main(String[] args) {
		int num = 1;
		do {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		} while (num <= 100);
	}
}