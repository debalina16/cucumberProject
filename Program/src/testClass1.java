
public class testClass1 {
static int a;
int b;
public static void main (String args[]){
	
	System.out.println(a);
	testClass1 obj=new testClass1();
	System.out.println(obj.b);
	obj.a=100;
	obj.b=200;
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(a);
	testClass1 obj1=new testClass1();
	obj1.a=889;
	obj1.b=600;
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	testClass1 obj2=new testClass1();
	System.out.println(obj2.a);
	System.out.println(obj2.b);
}
}
