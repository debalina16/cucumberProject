package StringPractise;
public class StringExample {

	public static void main(String[] args) {
		String str="Jaavaaav";
		String str1="";
		System.out.println(str1.isEmpty());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.toString());
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.replace("av", "pop"));
        int a=10;
        String s1=str.valueOf(a);
        int b=20;
        String s2=str.valueOf(b);
        System.out.println(a+b);
        System.out.println(s1+s2);
	}

}
