package StringPractise;

public class ContainsCompareTochararrayChatat {

	public static void main(String[] args) {
    String str="Java Selenium";
    String str1="Java";
    String str2="java";
    //contains()method
    System.out.println(str.contains(str1));
    System.out.println(str1.contains(str));
    System.out.println(str1.contains("Sel"));
    //compare()method
    System.out.println(str.compareTo(str1));
    System.out.println(str1.compareTo(str));
    System.out.println(str.compareTo(str2));
    //toCharArray()method
    char[] arr=str.toCharArray();
    System.out.println(arr.length);
    System.out.println(str.length());
    for(int i=arr.length-1;i>=0;i--) {
    	System.out.print(arr[i]);
    }
    System.out.println();
    //char[] to string 
    String s="";
    for(int i=arr.length-1;i>=0;i--) {
    	s=arr[i]+s;
    }
    System.out.print(s);
	//charAt() method
    System.out.println();
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}

}}
