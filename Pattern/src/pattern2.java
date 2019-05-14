
public class pattern2 {

	public static void main(String args[]){
		int num=6;
		for(int i=1;i<=num;i++){
			for(int j=num;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
