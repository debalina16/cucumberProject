package prog;

public class method5 {
method5(){
	System.out.println("Constructor");
}
void m1(){
		System.out.println("Method Printed");
	}
public static void main(String args[]){
	method5 a1=new method5();
	new method5();
    a1.m1();
    new method5().m1();
}
}
