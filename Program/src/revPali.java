
public class revPali {
	
	public static void main (String args[]){
		
		int num=126521;
		int rev=0;
		int rem;
		int temp=num;
		
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(rev);
		
		if(rev==temp){
			System.out.println("Palindrame");
		}else{
			System.out.println("Not a Palindrame");
		}
	}
	

}
