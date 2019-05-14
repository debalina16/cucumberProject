package Hand;

import java.io.FileNotFoundException;  
import java.io.PrintWriter; 

public class Test {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		try {
			System.out.println(arr[6]);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Correct Index");
		}catch(ArithmeticException a) {
			System.out.println("Infinity Value");
		}catch(Exception e1) {
			System.out.println("Handled");
		}
		
		String str=null;
		try {
			System.out.println(str.charAt(10));
		}catch(NullPointerException n) {
			System.out.println("Throw Null");
		}
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException a1) {
			System.out.println("Cannot divide by zero");
		}
		
		String n="abc";
		try {
		int num=Integer.parseInt(n);
		}catch(NumberFormatException n1) {
			System.out.println("String is not applicable");
		}
		try {
		System.out.println(n.charAt(10));
		}catch(StringIndexOutOfBoundsException s) {
			System.out.println("String Incorrect Index");
			//System.exit(0);
		}
	   PrintWriter pw;  
		try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");  
        }  
		// providing the checked exception handler  
		catch (FileNotFoundException e) {  
              
            System.out.println("File Not Found");  
        }         
		finally {
			System.out.println("Rest of code...");
		}
	}

}
