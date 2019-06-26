/**
 * 
 */
package prog;

/**
 * @author Debalina
 *
 */
public class TwoDigitSumOfMiddleDigit {
	static int firstDigit(int n) {
		while (n >= 10) {
			n /= 10;
		}
		return n;
	}

	static int lastDigit(int n) {
		return (n % 10);
	}

	static int middleDigit(int n) {
		return (((n / 10) % 10));
	}

	public static void main(String[] args) {
		int n = 572;
		if (firstDigit(n) + lastDigit(n) == middleDigit(n)) {
			System.out.println("In "+ n +" = "+middleDigit(n)+" is summation "+firstDigit(n)+" and "+ lastDigit(n));
		} else {
			System.out.println("In "+ n +" = "+middleDigit(n)+" is not summation "+firstDigit(n)+" and "+ lastDigit(n));
		}
	}

}
