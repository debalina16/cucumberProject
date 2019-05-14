package StringPractise;

public class ConcatString1 {

	public static void main(String[] args) {
	String s1="Virat";
	String s2="Anushka";
	System.out.println(s1.hashCode());
	s1=s1.concat(s2);
	System.out.println(s1.hashCode());
	String s3="Virat";
	System.out.println(s3);
	System.out.println(s3.hashCode());
	}

}
