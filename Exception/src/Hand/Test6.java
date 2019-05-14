package Hand;

import java.io.*;  
	class M{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	public class Test6 {  
	   public static void main(String args[])throws IOException{//declare exception  
	     M m=new M();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  

