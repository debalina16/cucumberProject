package prog;

public class method3 {
/*static int a=200;
static int b=200;
int c =30;
int d=40;
*/
static int a;
static int b;
int c;
int d;
public static void main(String args[]){
	method3 m=new method3();
	System.out.println(m.a);
	System.out.println(m.b);
	System.out.println(m.c);
	System.out.println(m.d);
	m.a=10;
	m.b=20;
	m.c=30;
	m.d=40;
	System.out.println(m.a);
	System.out.println(m.b);
	System.out.println(m.c);
	System.out.println(m.d);
}
}
