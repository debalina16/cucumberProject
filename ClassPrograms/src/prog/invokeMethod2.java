package prog;

public class invokeMethod2 {

	void m(invokeMethod2 obj){
		System.out.println("I am invoked");
	}
    void n(){
    	m(this);
    }
	
	public static void main(String[] args) {
		invokeMethod2 m1=new invokeMethod2();
        m1.n();
	}

}
