package progs;

class A{  
	A(){  
	System.out.println("parent class constructor invoked");  
	}  
	}  
	class Instance1 extends A{  
	Instance1(){  
	super();  
	System.out.println("child class constructor invoked");  
	}  
	  
	{System.out.println("instance initializer block is invoked");}  
	  
	public static void main(String args[]){  
	Instance1 b=new Instance1();  
	}  
	}  

