package String;

public class sample4 {
	public static void main(String[] args) {
		String  str="Testpassed40Testpassed30Testpassed10";
		String s1,s2,s3;
		s1=str.substring(10,12);
		System.out.println(s1);
		s2=str.substring(22,24);
		System.out.println(s2);
		s3=str.substring(34,36);
		System.out.println(s3);
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)+Integer.parseInt(s3));
	
	}

}
