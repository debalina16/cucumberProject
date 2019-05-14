
public class Array9 {

	public static void main(String args[]){
		
		char[] copf={'d','e','c','a','f','f','e','i','n','a','t'};
		
		char[] copt=new char[7];
		
		System.arraycopy(copf, 2,copt, 0, 7);
		
		System.out.println(String.valueOf(copt));
		
	}
}
