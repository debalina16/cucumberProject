package Prag;

public class SimplSub {
	public static void main(String args[]){  
		   String s="SachinTendulkar";  
		   System.out.println(s.substring(6));//Tendulkar  
		   System.out.println(s.substring(0,6));//Sachin  
		  
		   String s1="javatpoint";  
		   System.out.println(s1.substring(2,4));//returns va  
		   System.out.println(s1.substring(2));//returns vatpoint 
		   
	 
	        String substr = s1.substring(0); // Starts with 0 and goes to end  
	        System.out.println(substr);  
	        String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  
	        System.out.println(substr2);    
	        String substr3 = s1.substring(5,15); // Returns Exception  
		 }  
}
