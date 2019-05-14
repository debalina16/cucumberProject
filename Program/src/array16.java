
public class array16 {
	public static void main (String args[]){
		int arr[]=new int[]{1,2,9,3,7,4,8,5};
        int temp,arc;
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
			}
            /*for(int i=0;i<arr.length;i++){
			 for(int j=i+1;j<arr.length;j++){
				 if(arr[i]<arr[j]){
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
			}*/
            for(int i=0;i<arr.length;i++){
   			 for(int j=i+1;j<arr.length;j++){
   				 if(arr[i]>arr[j]){
   					 arc=arr[i];
   					 arr[i]=arr[j];
   					 arr[j]=arc;
   				 }
   			 }
   			}
            System.out.println();
            for(int i=0;i<arr.length;i++){
    			
    			System.out.print(arr[i]+" ");
    			}
		}
	}
