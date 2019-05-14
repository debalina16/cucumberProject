package intra;

public class N1 implements I2{

	public void m1() {
		System.out.println("Came from I1");
		
	}

	public void m2() {
		System.out.println("Came from I1");
		
	}

	public void m3() {
		System.out.println("Came from I1");
		
	}

	public void m4() {
		System.out.println("Came from I1");
		
	}

	public void m5() {
		System.out.println("Came from I1");
		
	}
	public void m6() {
		System.out.println("Came from I1");
		
	}

	public static void main(String[] args) {
		I2 i2=new N1();
		i2.m1();
		i2.m2();
		i2.m3();
		i2.m4();
		i2.m5();
		i2.m6();
		i2.m8();
		i2.m9();
	}

	public void m8() {
		System.out.println("Came from I2");
		
	}

	public void m9() {
		System.out.println("Came from I2");	
		
	}

	
}
