/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		int number = 12121;
		int num1 = number;
		int temp = 0;
		int rem = 0;
		while (number > 0) {
			rem = number % 10;
			temp = temp*10 + rem;
			number = number / 10;
		}
		System.out.println(temp);
		if (num1 == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
