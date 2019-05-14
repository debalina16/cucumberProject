package String;

public class Sample3 {
    public static void main(String[] args) {
    	String str="40";
    	String s2="30";
    	
    	int s3 = Integer.parseInt(str);
    	int s4=Integer.parseInt(s2);
    	int s6=s3+s4;
    	System.out.println(s6);
    	
    	String number = "10";
    	Integer result = s6+Integer.valueOf(number);		
    	System.out.println(result);
	}
}
	
	
	