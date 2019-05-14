package String;

public class Multi {

public static void main(String[] args) {
	
	String exp="I Love You";
	String sda="I Love You";
	System.out.println(sda.concat(exp));
	System.out.println(sda.equals(exp));
	//System.out.println(sda.contains(exp));
	
	String s="abc";
	String s1="Abc";
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s.length());
	System.out.println(exp.length());
	String s2="                Abc Def Ghi            ";
	System.out.println(s2.length());
	System.out.println(s2);
	System.out.println(s2.trim());
	System.out.println(s.charAt(2));
	System.out.println(s.indexOf('c'));
	String s4="Bengali";
	String s5="malayalam";
	System.out.println(s4.indexOf('e'));
	System.out.println(s5.indexOf('a',5));
	System.out.println(exp.indexOf("You"));
	System.out.println(s4.toUpperCase());
	System.out.println(s4.toLowerCase());
	System.out.println(s4.substring(2));
	System.out.println(s4.substring(2, 5));
	String s6="";
	System.out.println(s6.length());
	System.out.println(s6.isEmpty());
}

}
