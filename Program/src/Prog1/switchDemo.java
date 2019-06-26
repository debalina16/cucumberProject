/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class switchDemo {
	public static void main(String[] args) {
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("sun");
			break;
        case 2:
			System.out.println("mon");
			break;
		case 3:
			System.out.println("tues");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thurs");
			break;
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("sat");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
