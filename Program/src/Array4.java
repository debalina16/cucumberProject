
public class Array4 {

	static void anno(int arr[]){
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
			if(min>arr[i]){
			min=arr[i];	
			}
			System.out.println(min);
	}
	
	
	public static void main(String args[]){
		
		anno(new int[]{10,20,30,40});//passing anonymous array to method
	}
}
