package Array;
/**
 * 
 */

/**
 * @author Debalina
 *
 */
public class arr2 {
	    static int smallest(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Smallest Number: "+min);
		return min;
	}
	
public static void main(String[] args) {
	/*int arr[]= {23,12,5,12,9};
	smallest(arr);*/
	smallest(new int[] {23,12,5,12,9});
}}
