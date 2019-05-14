package prog;

public class method2 {
	static method2 m;
	void m1(){
		System.out.println("Non-static Method 1");
		m2();
		m3();
	}
	void m2(){
		System.out.println("Non-static Method 2");
		
	}
	static void m3(){
		System.out.println("Static Method 1");
		m.m2();
	}
	static void m4(){
		System.out.println("Static Method 2");
		
	}
	public static void main(String args[]){
		m=new method2();
		m.m1();
		m4();
	}
}
