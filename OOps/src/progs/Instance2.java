package progs;

class Admin{  
	Admin(){  
	System.out.println("parent class constructor invoked");  
	}  
	}  
	  
	class Instance2 extends Admin{  
	Instance2(){  
	super();  
	System.out.println("child class constructor invoked");  
	}  
	  
		Instance2(int a){  
	//super();  
	System.out.println("child class constructor invoked "+a);  
	}  
	  
	{System.out.println("instance initializer block is invoked");}  
	  
	public static void main(String args[]){  
		Instance2 b1=new Instance2();  
		Instance2 b2=new Instance2(10);  
	}  
	} 