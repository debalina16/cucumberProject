package StringPractise;

public class EqualsIgnoreLength {
public static void main(String[] args) {
	String s1="Hello";
	String s2=new String("Hello");
	String s3="Hello";
	String s4="hello";
	String str="             Java        ";
	//equals() method
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	//'=='
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	//equals() method
	System.out.println(s1.equals(s4));
	//equalsIqnoreCase
	System.out.println(s1.equalsIgnoreCase(s4));
	//length() method
	System.out.println(str.length());
}

}
