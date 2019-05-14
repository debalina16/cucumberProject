package prog;

public class invokeMethod1 {
/*
 *  void m(){
		System.out.println("I am in m method");
	}
	invokeMethod1(int x){
	this.m();
	System.out.println("I am in method");
	}
	public static void main(String args[]){
		invokeMethod1 m1=new invokeMethod1(5);
	}

*/   invokeMethod1(){
	 this.n(5);
	 System.out.println("I am in m method");
    }
     void n(int x){
    	 System.out.println("I am in method,value="+x);
     }
     public static void main(String args[]){
    	 invokeMethod1 m1=new invokeMethod1(); 
     }
}
	
