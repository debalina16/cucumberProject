
public class static1 {
	
	static int count =0;
	static1()
	{
	count++;
	System.out.println(count);
	}
	
	public static void main (String args[]){
		
		static1 s1=new static1();
		static1 s2=new static1();
	}

}
