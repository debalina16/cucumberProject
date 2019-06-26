/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class largestCountSummation {
public static void main(String[] args) {
int num=516273840;
int i=0;
int sum=0;
int lar=0;
int temp=0;
while(num>0) {
	temp=num%10;
	if(temp>lar) {
		lar=temp;
	}
	sum=sum+temp;
	num=num/10;
	i++;
}System.out.println(lar);
System.out.println(i);
System.out.println(sum);
}
}
