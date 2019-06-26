/**
 * 
 */
package Prag;

/**
 * @author Debalina
 *
 */
public class paliInt {
	public static void main(String[] args) {
	int a = 121;
	int temp = a;
    int b=0;
   while(a>0)
	{
		int n = a % 10;
		b = (b * 10) + n;
		a= a/10;
	}if(b==temp)
	{
		System.out.println("Plaindrome Number");
	}else
	{
		System.out.println("Not a Palindrome Number");
	}
 }
}
