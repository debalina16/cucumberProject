
public class pattern7 {

	public static void main(String args[]){
		
		int num=6;
		for(int i=1;i<=num;i++){
			for(int j=num;j>i;j--){
				System.out.print(" ");  
	           }  
	           for (int k=0;k<(2*i-1);k++) {  
	               System.out.print("*"); 
	           } 
	            
			System.out.println();
		}
	}}

