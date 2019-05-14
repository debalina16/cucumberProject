package prog;

public class B {
int a;
int b=20;
static int c=30;
static int d=40;
B(){}
B(int a,int b){
	this.a=a;
	this.b=b;
}
void print(){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
int a=100;
int b=200;
c=3;
d=4;
int c=300;
int d=400;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	System.out.println(this.a);
	System.out.println(this.b);
	System.out.println(B.c);
	System.out.println(B.d);
}
public static void main(String args[]){
	B b=new B();
	b.print();
	B b1=new B(50,500);
	b1.print();
	b.print();
	B b2=new B();
	b2.print();
}}


