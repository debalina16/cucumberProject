
public class array15 {

	public static void main (String args[]){
		int arr[]=new int[]{0,1,2,3,4,5,-10};
		int min=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Smallest="+min);
		for(int i=0;i<arr.length;i++){
			
			sum=sum+arr[i];
		}
		System.out.println("sum="+sum);
		System.out.println("Length="+arr.length);
	}
	

}
