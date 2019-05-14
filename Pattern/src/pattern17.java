
public class pattern17 {
	public static void main(String args[]){
		int n=6;
		for(int i=1;i<=n;i++){
			for(int j=6;j>0;j--){
			   if(i==1||j==1||i==6||j==6)
			   {
				   System.out.print("D");
			   }
			   else{
				   System.out.print(" ");
			   }
			}	
			System.out.println();
		}
	}}

