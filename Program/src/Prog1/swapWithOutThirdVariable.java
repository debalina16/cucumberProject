/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class swapWithOutThirdVariable {
public static void main(String[] args) {
	int a=20;
	int b=10;
	System.out.println("before swap: "+a+" "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swap: "+a+" "+b);
	
}
}
