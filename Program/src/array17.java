
public class array17 {
	public static void main (String args[]){
		int arr[]=new int[]{1,2,3,4,5};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}	
		System.out.println("");
		for(int j=0;j<=arr.length;j=j+2){
			System.out.print(arr[j]);
		}
		System.out.println("");
		
		for(int i=1;i<arr.length;i=i+2){
			System.out.print(arr[i]);
		}
		}
}
