
public class pattern5 {
 
	public static void main(String args[]){
		int num=6;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				
				if(j!=i){
				System.out.print(" ");
				}
				else{
				System.out.print(" #");	
				}
			}
			System.out.println();
		}
	}
}
