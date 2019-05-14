
public class array14 {

	public static void main (String args[]){
		int arr[]=new int[]{1,2,3,4,5};
		int lar=arr[0];
		for(int i=0;i<arr.length;i++){
			
			if(lar<arr[i]){
				lar=arr[i];
			}
		}System.out.println(lar);
	}
}