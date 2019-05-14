package prog;

public class Abc {
static int a;
static int b;
int c;
int d;

Abc(){}

Abc(int c,int d){
	this.c=c;
	this.d=d;
}
static void print(){
	System.out.println(a);
	System.out.println(b);
	a=300;
	b=400;
}
void printVal(){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	System.out.println(Abc.a);
	System.out.println(Abc.b);
	System.out.println(this.c);
	System.out.println(this.d);
}
public static void main(String args[]){
	Abc a1=new Abc();
	print();
	a1.printVal();
	Abc a2=new Abc(50,100);
	print();
	a2.printVal();
}
}
