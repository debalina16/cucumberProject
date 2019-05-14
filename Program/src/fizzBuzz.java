
public class fizzBuzz {

	public static void main(String args[]){
		int num=1;
		
		do{
			if(num%3==0 && num%5==0){
				System.out.println(num+"=FizzBuzz");
			}
			else if(num%3==0){
				System.out.println(num+"=Fizz");
			}
			else if(num%5==0){
				System.out.println(num+"=Buzz");
			}
			num++;
		}while(num<500);
			
	}
}
