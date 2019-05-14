package prog;

public class Xyz {

	Xyz(){
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Non-static Block");
	}
	
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Non-static Block 1");
	}
	static
	{
		System.out.println("Static Block 1");
	}
	public static void main(String args[]){
		Xyz x=new Xyz();
		Xyz x1=new Xyz();
	
	}
}
