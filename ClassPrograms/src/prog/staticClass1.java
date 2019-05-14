package prog;

public class staticClass1 {
static int a=20;
static int b =10;
	static void add(){
		System.out.println("Sum="+(a+b));
	}
	static int sub(){
		return a-b;
	}
	static String str(){
		return "abc";
	}
public static void main(String args[]){
	
	add();
	int result=sub();
	System.out.println(result);
	System.out.println(sub());
	String ab=str();
	System.out.println(ab);
	System.out.println(str());
	
	
}
}
