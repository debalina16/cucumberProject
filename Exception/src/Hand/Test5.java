package Hand;

import java.io.*; 

class M1{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	
	public class Test5{  
	   public static void main(String args[]){  
	    try{  
	     M1 m=new M1();  
	     m.method();  
	    }catch(Exception e){System.out.println("exception handled");}     
	  
	    System.out.println("normal flow...");  
	  }  
	}  

