
	class ABC
	{  
		ABC()
		{
			System.out.println("Call ABC Method");
		}  
		ABC(int x)
		{  
			this();  
			System.out.println(x);  
		}  
	}  
		class conthis
		{  
		public static void main(String args[])
			{  
			ABC a=new ABC(10);  
		    }   
		}  
	

