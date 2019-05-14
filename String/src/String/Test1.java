package String;

public class Test1 {
	public static void main(String[] args) {
		String str="Virat";
		String str1="Anushka";
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		String str2=str.concat(str1);
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		String str4="Virat";
		System.out.println(str4.hashCode());
	}

}
