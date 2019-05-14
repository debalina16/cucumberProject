package String;

public class Rev2 {
public static void main(String[] args) {
	String s="I Love Java";
	String [] arr=s.split(" ");
	System.out.println(arr.length);
	for(int i=arr.length-1;i>=0;i--){
		System.out.print(arr[i]+" ");
	}
}
}
