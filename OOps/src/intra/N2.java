package intra;

public class N2 extends Ab1 implements I1{

	public void m1() {
		System.out.println("Came from I1 ");
		
	}

	public void m3() {
		System.out.println("Came from I1 ");
		
	}

	public void m4() {
		System.out.println("Came from I1 ");
		
	}

	public void m5() {
		System.out.println("Came from I1 ");
	}

	public void m6() {
		System.out.println("Came from I1 ");
		
	}

	void m7() {
		System.out.println("Came from Ab1 ");
		
	}
	public static void main(String[] args) {
		Ab1 a1= new N2();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
		a1.m5();
		a1.m6();
		a1.m7();
		
		I1 i1=new N2();
		
		i1.m1();
		i1.m2();
		i1.m3();
		i1.m4();
		i1.m5();
		i1.m6();		
		
	}

}
