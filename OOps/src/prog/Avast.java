package prog;

class Antivirus{
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

public class Avast extends Antivirus {
	
	int a=50;
	int b=60;
	static int c=70;
	static int d=80;
	
	void m1(){
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		System.out.println("Sub-class method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Antivirus.c);
		System.out.println(Antivirus.d);
	}
    void call(){
    	this.m1();
    	super.m1();
    }
    public static void main(String[] args) {
		Avast a1=new Avast();
		a1.call();
	}
}
