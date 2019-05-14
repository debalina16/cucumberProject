package Hand;

import java.io.IOException;

public class Test4 {
  
	  void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  Test4 obj=new Test4();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	} 
