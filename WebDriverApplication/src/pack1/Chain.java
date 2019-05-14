package pack1;

class A{
	B mtd1() {
	System.out.println("Execute method1");
    B b1=new B();
    return b1;
}
}
class B{
	void mtd2() {
		System.out.println("Execute method2");
	}
}
public class Chain {
public static void main(String[] args) {
	A a1=new A();
	B b1=a1.mtd1();
	b1.mtd2();
	//a1.mtd1().mtd2();
	
}
}
