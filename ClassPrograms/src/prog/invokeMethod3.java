package prog;

 class A {
	invokeMethod3 obj;
	A(invokeMethod3 obj){
	this.obj=obj;	
	}
	void m(){
	 System.out.println("value is "+obj.x);  
   }
 }
	
 class invokeMethod3{
	int x=10;
	
	invokeMethod3(){
		A a1=new A(this);
		a1.m();
    }
	public static void main(String args[]){
	invokeMethod3 m1=new invokeMethod3();
	}
}
