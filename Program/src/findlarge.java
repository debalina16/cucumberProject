
public class findlarge {

	public static void main(String args[]){
		int num=1236783923;
		int rem;
		int lar=0;
		while(num>0){
			
			rem=num%10;
			
			if(rem>lar){
				lar=rem;	
			}
			num=num/10;
			
		}
		System.out.println("Largest digit is="+lar);
		
	}
}
