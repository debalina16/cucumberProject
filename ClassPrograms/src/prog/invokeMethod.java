package prog;

public class invokeMethod {
     
	void main(){
		System.out.println("I am in main method");
	}
	void n(){
		main();
		System.out.println("I am in n method");
		
	}
	
	public static void main(String args[]){
		invokeMethod m1=new invokeMethod();
	    m1.n();
	    
	}
}
