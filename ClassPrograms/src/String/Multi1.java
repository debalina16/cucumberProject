package String;

public class Multi1 {
	public static void main(String[] args) {
		String str="Virat";
		System.out.println(str.hashCode());
		String str1="Anushka";
		str=str.concat(str1);
		System.out.println(str);
		System.out.println(str.hashCode());
		String s="Virat";
		System.out.println(s.hashCode());
	}

}
