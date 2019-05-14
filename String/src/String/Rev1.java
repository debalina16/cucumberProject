package String;

public class Rev1 {
	public static void main(String[] args) {
		String str="Java";
		String s=" ";
		for(int i=str.length()-1;i>=0;i--){
			s=s+str.charAt(i);
		}
		System.out.println(s);
	}

}
