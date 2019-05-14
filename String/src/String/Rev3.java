package String;

public class Rev3 {

public static void main(String[] args) {
		
	String name="Java is easy";
	String [] arr=name.split(" ");
	System.out.println(arr.length);
	for(int i=0;i<arr.length;i++){
		String str=arr[i];
		for(int j=str.length()-1;j>=0;j--){
			System.out.print(str.charAt(j));
		}
		System.out.print(" ");
		
	}
	}
}
