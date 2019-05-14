
public class prime1 {

	public static void main(String args[]){
		
		for(int num=1;num<=100;num++){
		boolean flag=true;
			for(int i=2;i<num;i++){
			
				if(num%i==0){
				flag=false;
				break;
				}
			}
			if(flag){
				System.out.println(num);
			}
		}	
	}
}
