
public class static2 {

        static int x;
       /* static2(int y){
        	
        	x=y;
        	int cube=(x*x*x);
        	System.out.println(cube);
       }*/ 

		static int cube(int x){
		return x*x*x;
		}
		public static void main (String args[]){
			
			
			int s1=static2.cube(5);
			System.out.println(s1);
		}

	}

