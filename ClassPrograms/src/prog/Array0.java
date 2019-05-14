package prog;

public class Array0 {
 public static void main(String[] args) {
	int arr []={10,5,4,2,0,17,29,19};
	System.out.println("Length="+arr.length);
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
}

}

