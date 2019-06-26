/**
 * 
 */
package Array;

/**
 * @author Debalina
 *
 */
public class arr3 {
	static int[] largest() {
		return new int[]{10,45,22,81,23};
	}
	public static void main(String[] args) {
		int a[]=largest();
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Smallest Number: "+max);
		
	}

}
