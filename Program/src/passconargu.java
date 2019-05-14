	
	class passconargu
	{  
		  void m(passconargu obj)
		  {  
			  System.out.println("method is invoked :)");  
		  }  
		  void p()
		  {  
			  m(this);  
		  }  
		  public static void main(String args[])
		  {  
			  passconargu s1 = new passconargu();  
			  s1.p();  
		  }  
	 }  


