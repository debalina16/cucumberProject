
public class Fibo2 {

	static int n1=0,n2=1,n3=0;
	
	static void Fibo(int count){
	if(count>0)
	  {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		Fibo(count-1);
	   }
	}
	public static void main(String[] args) {
	 
		int count=15;
		System.out.print(n1+" "+n2);  
		Fibo(count-2);
	}

}
