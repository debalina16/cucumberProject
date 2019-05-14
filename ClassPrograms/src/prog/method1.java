package prog;

public class method1 {
void m1(){
	System.out.println("Non-static Method 1");
}
int m2(){
	System.out.println("Non-static Method 2");
	return 0;
}
public static void main(String args[]){
	method1 m=new method1();
	m.m1();
	m.m2();
}
}
