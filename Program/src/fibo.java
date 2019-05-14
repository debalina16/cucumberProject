
public class fibo {

	public static void main(String[] args) {

      int pre=0;
      int rev=1;
      System.out.println(pre);
      System.out.println(rev);
      /* for(int i=0;i<7;i++){
    	  
    	  int sum=pre+rev;
    	  pre=rev;
    	  rev=sum;
    	  System.out.println(sum);
      }*/
      /*int i=0;
      while(i<7){
    	  int sum=pre+rev;
    	  pre=rev;
    	  rev=sum;
    	  System.out.println(sum); 
    	  i++;
      }*/
      int i=0;
      do{
    	  int sum=pre+rev;
    	  pre=rev;
    	  rev=sum;
    	  System.out.println(sum); 
    	  i++;
      }while(i<7);
      
	}

}
