/**
 * 
 */

/**
 * @author Debalina
 *
 */
public class palistring {
	/*public static void main(String[] args) {
		String abc = "radar";
		String temp = abc;
		String rev = "";
		for (int i = abc.length() - 1; i >= 0; i--) {
			rev = rev + abc.charAt(i);
		}
		if (temp.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}*/
	
	public static void revString(String str) {
		String rev = new StringBuffer(str).reverse().toString();
		if (str.equals(rev)) {
			System.out.println("Palindrome");

		} else {
			System.out.println("Not a Palindrome");
		}

	}

	public static void main(String[] args) {
		revString("radar");
		revString("malayalam");
	}
}
