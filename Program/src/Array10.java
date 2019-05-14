
public class Array10 {

	public static void main(String args[]){
	
		int a[][]={{3,2,4},{3,2,9}};
		int b[][]={{5,6,7},{2,9,8}};
		
		int c[][]=new int[2][3];
		
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				c[i][j]= a[i][j]+b[i][j];
				System.out.print(c[i][i]+ " ");
			}
			System.out.println();
		}
	}
	
}
