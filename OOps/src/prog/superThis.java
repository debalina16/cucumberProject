package prog;

class A{
	A(){
		super();
		System.out.println("Super-class Constructor");
	}
}

class superThis extends A {
	superThis(){
		super();
		System.out.println("Sub-class Constructor");
	}
	superThis(int a){
		this();
		System.out.println("Sub-class Constructor 1");
	}
	public static void main(String args[]){
		superThis s1=new superThis(10);
	}

}
