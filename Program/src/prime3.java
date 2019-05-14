
public class prime3 {
	public static void main(String args[]){
		
		for(int num=1;num<=1000;num++){
	   
		boolean flag=true;
			for(int i=2;i<num;i++){
			
				if(num%i==0){
				flag=false;
				break;
				}
			}
			if(flag){
				int rem=0;
				int rev=0;
				int sum;
				int temp=num;
				int num1=num;
					while(num1>0){
						rem=num1%10;
						rev=rev*10+rem;
						num1=num1/10;
					}
					if(rev==temp){
						System.out.println(temp);
				
					}
		}  	}
	}
}
