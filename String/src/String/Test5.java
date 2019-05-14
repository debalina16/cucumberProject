package String;

public class Test5 {
public static void main(String[] args) {
	String str="Java";
	char [] ch=str.toCharArray();
	System.out.println(ch.length);
	System.out.println(ch);
	
	for(int i=ch.length-1;i>=0;i--){
		System.out.print(ch[i]);
	}
}
}
