package prog;

class Admin{
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;

	void m1(){
		System.out.println("Super Class method");
	}
	static void m2(){
		System.out.println("Super class static method");
	}
}
class Overme extends Admin{

	int a=100;
	int b=200;
	static int c=300;
	static int d=400;

	void m1(){
		System.out.println("Sub Class method");
	}
	static void m2(){
		System.out.println("Super class static method");
	}
	public static void main(String[] args) {
		Overme b1=new Overme();
		b1.m1();
		Overme.m2();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(c);
		System.out.println(d);
		Admin b2=new Admin();
		System.out.println(b2.a);
		System.out.println(b2.b);
		System.out.println(Admin.c);
		System.out.println(Admin.d);
		System.out.println("Upcasting========");
		Admin b3=new Overme();
		b3.m1();
		b3.m2();
		System.out.println(b3.a);
		System.out.println(b3.b);
		System.out.println(c);
		System.out.println(d);
		
		
	}	
}
