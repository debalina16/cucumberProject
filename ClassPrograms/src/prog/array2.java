package prog;

public class array2 {
public static void main(String args[]){
	int [] arr={2,5,34,67,32,8};
	int num=8;
	int flag=0;
	for(int i=0;i<arr.length;i++){
		if(num==arr[i]){
			flag=1;
			
	    }
		else{
			flag=0;
		}
	
	}	if(flag==1){
			System.out.print("Found "+num);
	}
	else{
		System.out.print("Not Found");
	
}
}}
