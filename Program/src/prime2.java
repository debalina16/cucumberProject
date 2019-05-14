
public class prime2 {

public static void main(String args[]){
		int count=0;
		int sum=0;
		for(int num=1;num<=100;num++){
	   
		boolean flag=true;
			for(int i=2;i<num;i++){
			
				if(num%i==0){
				flag=false;
				break;
				}
			}
			if(flag){
				count++;
				System.out.println(num);
				sum +=num;
				
			}
		}System.out.println("Count is "+count);
		 System.out.println("Sum of Primes"+sum);
	}
}
