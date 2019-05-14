
public class sumOfdigis {

	public static void main(String args[]){
				int num=1245;
				int rem=0;
				int lar=0;
				while(num>0){
					
					rem=num%10;
					
					lar=lar+rem;	
					
					num=num/10;	
				}
				
				 System.out.println(lar);
				}
				
		}
					
		
		
