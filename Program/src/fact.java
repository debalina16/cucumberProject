
public class fact {

	static int i=5;
	static int fact=1;
	static int num=i;
	
	public static void main(String[] args) {
		/*while(i>0)
		{
			fact=fact*i;
			i--;
		}
		*/	
		/*do{
			fact=fact*i;
			i--;
		 }while(i>0);
		*/
		for(i=num;i>0;i--){
			
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
