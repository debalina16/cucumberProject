

	class simple
	{  
		simple()
		{  
			this(5);  
			System.out.println("hello a");  
	    }  
		simple(int x)
		{  
			System.out.println(x);  
		}  
	}  
		class conthisagain
		{  
			public static void main(String args[])
			{  
				simple a=new simple();  
		    }
		}  

