

	class B
	{  
		  callconstru obj;  
		  B(callconstru obj)
		  {  
		    this.obj=obj;  
		  }  
		  void display()
		  {  
		    System.out.println("Passing value:" +obj.data);//using data member of A4 class  
		  }  
	}  
		  
		class callconstru
		{  
		   int data=10;  
		   callconstru()
		   {  
			   B b=new B(this);  
			   b.display();  
		   }  
		  public static void main(String args[])
		  {  
			  callconstru a=new callconstru();  
		  }  
		}  

