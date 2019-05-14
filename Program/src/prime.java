
public class prime {

	public static void main(String args[]){
		int num=181;
		boolean flag=true;
		for(int i=2;i<num;i++){
			
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Prime");
		}else{
			System.out.println("Not a prime");
		}
			
		}
	}

